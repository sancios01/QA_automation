package browserfactory;

import org.openqa.selenium.WebDriver;

import resourcereader.ConfigPropertyReader;

public class DriverManager {

	private static final ThreadLocal<WebDriver> threadLocal = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return threadLocal.get();
	}

	public static void setDriver(String scenarioName) throws Exception {
		// ea driver din driverfactory
		WebDriver webDriver = DriverFactory.getDriver(ConfigPropertyReader.getSessionConfig());
		threadLocal.set(webDriver);
	}

	public static void closeDriver() {
		if (threadLocal.get() != null) {
			try {
				threadLocal.get().quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		threadLocal.remove();
	}
}
