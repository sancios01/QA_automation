package keywords;

import browserfactory.DriverManager;

import org.openqa.selenium.WebDriver;


import java.util.List;

public class BasePage {

	protected WebDriver driver;
	//public YamlReader testData;
	
	public BasePage() {
		this.driver = DriverManager.getDriver();
		testData = new YamlReader();
	}
	

	
}
