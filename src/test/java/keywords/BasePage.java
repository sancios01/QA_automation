package keywords;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import browserfactory.DriverManager;

public class BasePage {

	protected WebDriver driver;

	public BasePage() {
		this.driver = DriverManager.getDriver();
	}

	public WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public void enterText(WebElement element,String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	public void clickUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
	}
}
