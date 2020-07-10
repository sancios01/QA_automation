package browserfactory;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class DriverManager {
	

	/** The Constant threadLocal. */
	private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return threadLocal.get();
	}

	public static void setDriver(String scenarioName) throws Exception {
		System.out.println("Runnig Scenario : "+scenarioName);
		HashMap<String,String> configSettings = ConfigProperty._getSessionConfig();
		DriverClass driverClass = new DriverClass();// main class for initliazing browser
		threadLocal.set(driverClass.getBrowser(configSettings));
	}

	public static void closeDriver() {
		if (getDriver() != null) {
			try {
				getDriver().quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		threadLocal.remove();
	}
}
