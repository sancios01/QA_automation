package stepDefs;

import browserFactory.DriverClass;
import browserFactory.DriverManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import actions.HowToCommandPageActions;
import logger.MainLogger;
import org.junit.Assert;
import resourceReader.ConfigPropertyReader;

import java.util.HashMap;

public class HowToCommandStepdef {

	private HowToCommandPageActions howToCommandPageActions;

    public HowToCommandStepdef() {
        this.howToCommandPageActions = new HowToCommandPageActions();
    }

	@When("User clicks on the howtoCommand? icon")
	public void userClicksOnHowtoCommandIcon() {
		howToCommandPageActions.clickOnInfoButton();
	}

	@Then("User is redirected to the howtoCommand page")
	public void userIsRedirectedToHowtoCommandPage() {
		String currentUrl = DriverManager.getDriver().getCurrentUrl();

    	if (currentUrl.contains("zap.md/cum-comand"))
		   MainLogger.logger().info("After click on \'cum comand\' the user is redirected to the info page");
		else
			MainLogger.logger().error("After click on \'cum comand\' the user is not redirected to the info page");

	    Assert.assertEquals("https://www.zap.md/cum-comand", currentUrl);
    }

	@Then("the header of displayed page is {string}")
	public void headerOfDisplayedPageIsCumComand(String string) {
		String pageHeader = howToCommandPageActions.getInfoPageHeader();
		Assert.assertEquals(string, pageHeader);
		MainLogger.logger().info("Correct header page is displayed: "+ string);
	}


	@Then("on the top of Cum_comang page is displayed the button changing the language")
	public void cumComandPageContainsChangingLanguageButtonOnTheTopOfPage() {
    	boolean TopLangBtn = howToCommandPageActions.getTopLanguageBtn();
    	if (TopLangBtn)
		{MainLogger.logger().info("Language button on the top of page is displayed");}
    	else
		{MainLogger.logger().error("Language button on the top of page is not displayed");}

    	Assert.assertTrue(TopLangBtn == true);

	}

	@Then("on the bottom of Cum_comang page is displayed the button changing the language")
	public void cumComandPageContainsChangingLanguageButtonOnTheBottomOfPage() {
		boolean BottomLangBtn = howToCommandPageActions.getBottomLanguageBtn();
		if (BottomLangBtn)
		{MainLogger.logger().info("Language button on the bottom of page is displayed");}
		else
		{MainLogger.logger().error("Language button on the bottom of page is not displayed");}

		Assert.assertTrue(BottomLangBtn == true);

	}

	@When("User clicks on changing language button from the top of page")
	public void userClicksOnChangingLanguageButtonFromTheTopOfPage() {
		howToCommandPageActions.clickOnTopLanguageBtn();
		MainLogger.logger().info("By click on the changing language button on the top of page, the language was changed");
	}

	@When("User clicks on changing language button from the bottom of page")
	public void userClicksOnChangingLanguageButtonFromTheBottomOfPage() {
		howToCommandPageActions.clickOnBottomLanguageBtn();
		MainLogger.logger().info("By click on the changing language button on the bottom of page, the language was changed");
	}


	@When("User clicks on home logo")
	public void userClicksOnHomeLogo() {
		howToCommandPageActions.clickOnHomeButtom();
		MainLogger.logger().info("User clicks on home button");
	}


	@Then("User is redirected to the home page")
	public void userIsRedirectedToTheHomePage() {
		HashMap<String,String> configSettings = ConfigPropertyReader.getSessionConfig();
		DriverClass driverClass = new DriverClass();

		String currentUrl = DriverManager.getDriver().getCurrentUrl();

		if (currentUrl.contains(driverClass.getUrl(configSettings)))
			MainLogger.logger().info("After click on homeIcon the user is redirected to landing page");
		else
			MainLogger.logger().error("After click on homeIcon the user is not redirected to the landing page");

		Assert.assertEquals(driverClass.getUrl(configSettings), currentUrl);
	}

}


