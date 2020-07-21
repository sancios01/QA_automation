package keywords;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.HomePageLocators;

public class HomePageKeywords extends BasePage {

	private HomePageLocators homePageLocators;

	public HomePageKeywords() {
		homePageLocators = new HomePageLocators();
	}

	public void launchApplication(String url) {
		driver.get(url);
	}

	public void enterTextInSearchBox(String text) {
		enterText(getElement(homePageLocators.searchBox), text + Keys.ENTER);
	}

	public String getSearchResultHeaderResult() {
		return getElement(homePageLocators.searchResultHeader).getText();
	}

	public int getNumberOfSearchResult() {
		return getElements(homePageLocators.resultProductImages).size();
	}

	public void clickOnFirstProductImage() {
		getElements(homePageLocators.resultProductImages).get(0).click();
	}

	public String getFaceBookContactLink() {
		return getElement(homePageLocators.faceBookFooterLink).getText();
	}

	public String getTwitterContactLink() {
		return getElement(homePageLocators.twitterLink).getText();
	}

	public String getEmailContactText() {
		return getElement(homePageLocators.mailLink).getText();
	}

	public void clickOnCartIcon() {
		WebElement webElement = getElement(homePageLocators.cartIcon);
		ExpectedCondition<WebElement> expectedCondition = ExpectedConditions.visibilityOf(webElement);

		new WebDriverWait(driver, 30)
				.until(expectedCondition)
				.click();
	}
}
