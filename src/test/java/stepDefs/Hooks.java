package stepDefs;

import browserFactory.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import logger.MainLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Hooks {

	@Before
	public void LaunchBrowser(Scenario scenario) throws Exception {
		DriverManager.setDriver(scenario.getName());
	}

	@Before
	public void startScenarioMsg(Scenario scenario) throws Exception {
		String scenarioName = scenario.getName();
		MainLogger.logger().info("--------STARTING SCENARIO--------" + scenarioName);
	}

	public final void TakeScreenshotAfterStep(Scenario scenario) {
		final byte[] imgBytes = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
		scenario.embed(imgBytes, "image/png", "Image");
	}

	@After
	public void endScenarioMsg(Scenario scenario) throws Exception {
		MainLogger.logger().info("");
	}

	@After
	public void CloseBrowser(Scenario scenario) {
		if (scenario.isFailed()) {
			TakeScreenshotAfterStep(scenario);
		}
		DriverManager.closeDriver();
	}
}
