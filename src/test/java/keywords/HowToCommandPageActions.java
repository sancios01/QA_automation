package keywords;


import pageobjects.HowToCommandPage;

public class HowToCommandPageActions extends BasePage {

	private HowToCommandPage howToCommandPageLocators ;

	public HowToCommandPageActions() {
		howToCommandPageLocators = new HowToCommandPage();
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
