package keywords;

import pageobjects.HowToCommandPageLocators;

// TODO: Auto-generated Javadoc

/**
 * The Class ProductDescriptionPageKeywords.
 */
public class HowToCommandPageKeywords extends BasePage {

	/** The product description page locators. */
	private HowToCommandPageLocators howToCommandPageLocators ;

	/**
	 * Instantiates a new product description page keywords.
	 */
	public HowToCommandPageKeywords() {
		howToCommandPageLocators = new HowToCommandPageLocators();
	}
	

	public void clickOnInfoButton() {
		getElement(howToCommandPageLocators.btnInfo).click();
	}

	public String getInfoPageHeader() {
		return getElement(howToCommandPageLocators.infoHeader).getText();
	}

	public boolean getTopLanguageBtn() {
		return getElement(howToCommandPageLocators.languageTopBtn).isDisplayed();
	}

	public boolean getBottomLanguageBtn() {
		return getElement(howToCommandPageLocators.languageBottomBtn).isDisplayed();
	}

	public void clickOnTopLanguageBtn() {
		getElement(howToCommandPageLocators.languageTopBtn).click();
	}

	public void clickOnBottomLanguageBtn() {
		getElement(howToCommandPageLocators.languageBottomBtn).click();
	}

	public void clickOnHomeButtom() {
		getElement(howToCommandPageLocators.homeBtn).click();
	}
}
