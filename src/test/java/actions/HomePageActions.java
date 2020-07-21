package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.HomePage;


/**
 * The Class HomePageKeywords.
 */
public class HomePageActions extends BasePage {

	/** The home page locators. */
	private HomePage homePageLocators;


	public HomePageActions() {
		homePageLocators = new HomePage();
	}

	/**
	 * Launch application.
	 *
	 * @param url the url
	 */
	public void launchApplication(String url) {
		driver.get(url);
	}

	/**
	 * Enter text in search box.
	 *
	 * @param text the text
	 */
	public void enterTextInSearchBox(String text) {
		enterText(getElement(homePageLocators.searchBox), text);
		getElement(homePageLocators.searchBox).sendKeys(Keys.ENTER);
	}

	/**
	 * Gets the search result header result.
	 *
	 * @return the search result header result
	 */
	public String getSearchResultHeaderResult() {
		return getElement(homePageLocators.searchResultHeader).getText();
	}

	/**
	 * Gets the number of search result.
	 *
	 * @return the number of search result
	 */
	public int getNumberOfSearchResult() {
		return getElements(homePageLocators.resultProductImages).size();
	}

	/**
	 * Click on first product image.
	 */
	public void clickOnFirstProductImage() {
		getElements(homePageLocators.resultProductImages).get(0).click();
	}

	/**
	 * Gets the face book contact link.
	 *
	 * @return the face book contact link
	 */
	public String getFaceBookContactLink() {

		return getElement(homePageLocators.faceBookFooterLink).getText();
	}

	/**
	 * Gets the twitter contact link.
	 *
	 * @return the twitter contact link
	 */
	public String getTwitterContactLink() {

		return getElement(homePageLocators.twitterLink).getText();
	}

	/**
	 * Gets the email contact text.
	 *
	 * @return the email contact text
	 */
	public String getEmailContactText() {

		return getElement(homePageLocators.mailLink).getText();
	}

	/**
	 * Click on cart icon.
	 */
	public void clickOnCartIcon() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(getElement(homePageLocators.cartIcon)));
		getElement(homePageLocators.cartIcon).click();
	}

}
