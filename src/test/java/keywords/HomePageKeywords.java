package keywords;

import keywords.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HomePageLocators;

// TODO: Auto-generated Javadoc


public class HomePageKeywords extends BasePage {

	/** The home page locators. */
	private HomePageLocators homePageLocators;


	public HomePageKeywords() {
		homePageLocators = new HomePageLocators();
	}


	public void launchApplication(String url) {
		driver.get(url);
	}


	public void enterTextInSearchBox(String text) {
		enterText(getElement(homePageLocators.searchBox), text);
		getElement(homePageLocators.searchBox).sendKeys(Keys.ENTER);
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
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(getElement(homePageLocators.cartIcon)));
		getElement(homePageLocators.cartIcon).click();
	}

}
