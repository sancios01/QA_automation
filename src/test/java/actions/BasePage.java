package actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import browserFactory.DriverManager;

public class BasePage {

	protected WebDriver driver;

	public BasePage() {
		this.driver = DriverManager.getDriver();
	}

	/**
	 * retrun the webelement
	 * @param locator
	 * @return
	 */
	public WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	/**
	 * retrun the webelement
	 * @param locator
	 * @return
	 */
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	/**
	 * Method enter text in element
	 * @param element
	 * @param text
	 */
	public void enterText(WebElement element,String text) {
		element.click();
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Click using js
	 * @param element
	 */
	public void clickUsingJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element);
	}

}
