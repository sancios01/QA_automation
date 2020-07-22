package browserfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;


public class DriverFactory {

	private Map<String, String> configuration;

	public static WebDriver getDriver(Map<String, String> configuration) {
		WebDriver driver = initiliazeDriver(configuration.get("browser"), configuration.get("browserversion"));
		driver.manage().timeouts().implicitlyWait(Long.valueOf(configuration.get("implicitwait")), TimeUnit.SECONDS);
		return driver;
	}

	
	private static WebDriver initiliazeDriver(String browser, String browserVersion){
		if("chrome".contains(browser.toLowerCase()))
		{
			return getChrome(browserVersion);
		}

		if("firefox".contains(browser.toLowerCase()))
		{
			return getFireFox(browserVersion);
		}

		return null;
	}

	private static WebDriver getChrome(String version) {
		if(version.isEmpty())
			WebDriverManager.chromedriver().setup();
		else
			WebDriverManager.chromedriver().version(version).setup();
		return new ChromeDriver(new ChromeOptions());
	}

	private static WebDriver getFireFox(String version) {
		if(version.isEmpty())
			WebDriverManager.firefoxdriver().setup();
		else
			WebDriverManager.firefoxdriver().version(version).setup();

		LoggingPreferences pref = new LoggingPreferences();
		pref.enable(LogType.BROWSER, Level.OFF);
		pref.enable(LogType.CLIENT, Level.OFF);
		pref.enable(LogType.DRIVER, Level.OFF);
		pref.enable(LogType.PERFORMANCE, Level.OFF);
		pref.enable(LogType.PROFILER, Level.OFF);
		pref.enable(LogType.SERVER, Level.OFF);
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.firefox();
		desiredCapabilities.setCapability(CapabilityType.LOGGING_PREFS, pref);
		desiredCapabilities.setCapability("marionette", true);
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		return new FirefoxDriver(desiredCapabilities);
	}


	public String getUrl(Map<String, String> configuration) {
		this.configuration = configuration;
		String urlN = configuration.get("url").toString();
		return urlN;
	}
}
