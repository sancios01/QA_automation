package stepdefs;

import browserfactory.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.HowToCommandPageActions;
import keywords.HomePageKeywords;
import logger.MainLogger;
import org.junit.Assert;
import resourcereader.YmlReader;



public class HowToCommandStepdef {

	private HowToCommandPageActions howToCommandPageActions;
	
	private final String FILE_PATH = "src/test/resources/testdata/testdata.yml";

    public HowToCommandStepdef() {
        this.howToCommandPageActions = new HowToCommandPageActions();
    }

	@When("User clicks on the howtoCommand? icon")
	public void userClicksOnHowtoCommandIcon() { howToCommandPageActions.clickOnInfoButton();
	}

	@Then("User is redirected to the howtoCommand page")
	public void userIsRedirectedToHowtoCommandPage() {
		String currentUrl = DriverManager.getDriver().getCurrentUrl();

    	if (currentUrl.contains("zap.md/cum-comand"))
			MainLogger.log("After click on \'cum comand\' the user is redirected to the info page", this.getClass());
		else
			MainLogger.log("After click on \'cum comand\' the user is not redirected to the info page", this.getClass());

	    Assert.assertEquals("https://www.zap.md/cum-comand", currentUrl);
    }

	@Then("the header of displayed page is {string}")
	public void headerOfDisplayedPageIsCumComand(String string) {
		String pageHeader = howToCommandPageActions.getInfoPageHeader();
		Assert.assertEquals(string, pageHeader);
		MainLogger.log("Correct header page is displayed: "+ string, this.getClass());
	}


	@Then("on the top of Cum_comang page is displayed the button changing the language")
	public void cumComandPageContainsChangingLanguageButtonOnTheTopOfPage() {
    	boolean TopLangBtn = howToCommandPageActions.getTopLanguageBtn();

    	if (TopLangBtn)
		{MainLogger.log("Language button on the top of page is displayed", this.getClass());}
    	else
		{MainLogger.log("Language button on the top of page is not displayed", this.getClass());}

    	Assert.assertTrue(TopLangBtn);

	}

	@Then("on the bottom of Cum_comang page is displayed the button changing the language")
	public void cumComandPageContainsChangingLanguageButtonOnTheBottomOfPage() {
		boolean BottomLangBtn = howToCommandPageActions.getBottomLanguageBtn();
		if (BottomLangBtn)
		{MainLogger.log("Language button on the bottom of page is displayed", this.getClass());;}
		else
		{MainLogger.log("Language button on the bottom of page is not displayed", this.getClass());;}

		Assert.assertTrue(BottomLangBtn);

	}

	@When("User clicks on changing language button from the top of page")
	public void userClicksOnChangingLanguageButtonFromTheTopOfPage() {
		howToCommandPageActions.clickOnTopLanguageBtn();
		MainLogger.log("By click on the changing language button on the top of page, the language was changed", this.getClass());
	}

	@When("User clicks on changing language button from the bottom of page")
	public void userClicksOnChangingLanguageButtonFromTheBottomOfPage() {
		howToCommandPageActions.clickOnBottomLanguageBtn();
		MainLogger.log("By click on the changing language button on the bottom of page, the language was changed", this.getClass());
	}


	@When("User clicks on home logo")
	public void userClicksOnHomeLogo() {
		howToCommandPageActions.clickOnHomeButtom();
		MainLogger.log("User clicks on home button", this.getClass());
	}


	@Then("User is redirected to the home page")
	public void userIsRedirectedToTheHomePage() {
		String url = YmlReader.getYmlValue("app_url", FILE_PATH).toString();
		String currentUrl = DriverManager.getDriver().getCurrentUrl();

		if (currentUrl.contains(url))
			MainLogger.log("After click on homeIcon the user is redirected to landing page", this.getClass());
		else
			MainLogger.log("After click on homeIcon the user is not redirected to the landing page", this.getClass());

		Assert.assertEquals(url, currentUrl);
	}

}



