package stepdefs;

import browserfactory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.AfterStep;

public class Hooks {

	@Before
	public void LaunchBrowser(Scenario scenario) throws Exception {
		DriverManager.setDriver(scenario.getName());
	}

	public final void TakeScreenshotAfterStep(Scenario scenario) {
		final byte[] imgBytes = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(imgBytes, "image/png", "Image");
	}

	/*@AfterStep
	public void CloseBrowserAfterSt(Scenario scenario){
		if (scenario.isFailed()){
			DriverManager.closeDriver();
		}
	}*/

	@After
	public void CloseBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			TakeScreenshotAfterStep(scenario);
		}
		DriverManager.closeDriver();
	}
}
