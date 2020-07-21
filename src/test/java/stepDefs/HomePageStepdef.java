package stepDefs;

import browserFactory.DriverClass;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import actions.HomePageActions;
import logger.MainLogger;
import resourceReader.ConfigPropertyReader;

import java.util.HashMap;

public class HomePageStepdef {

	private HomePageActions homePage;

	public HomePageStepdef() {
		this.homePage = new HomePageActions();
	}

	@Given("User launches the application url")
	public void navigateToLandingPage() {
		HashMap<String,String> configSettings = ConfigPropertyReader.getSessionConfig();
		DriverClass driverClass = new DriverClass();// main class for initliazing browser
		MainLogger.logger().info("Application url is "+ driverClass.getUrl(configSettings) );
		homePage.launchApplication((driverClass.getUrl(configSettings)));
	}

	@When("Enters the search term {string} in search box")
	public void entersTheSearchTermInSearchBox(String string) {
		homePage.enterTextInSearchBox(string);
		homePage.getSearchResultHeaderResult();
		MainLogger.logger().info("Enter term "+string+" in search box");
	}

	@Then("products images should displayed after search")
	public void verifySearchResultCount() {
		int totalProductInPage = homePage.getNumberOfSearchResult();
		//olea-sa scot mesajul din assert true
		Assert.assertTrue("No search result displayed on page",totalProductInPage >0 );
		MainLogger.logger().info("Total product in cart "+totalProductInPage);
	}

	@Then("contact email should displayed in footer")
	public void contactEmailShouldBeDisplayedInFooter() {
		String emailText = homePage.getEmailContactText();
		MainLogger.logger().info("Contact Email address is " + emailText);
		Assert.assertEquals(emailText, "info@zap.md");
	}

	@Then("facebook link should be displayed footer")
	public void facebookLinkShouldBeDisplayedFooter() {
		String fbUrl = homePage.getFaceBookContactLink();
		MainLogger.logger().info("Facebook Page URL is " + fbUrl);
		Assert.assertTrue("Assertion Failed : Facebook link is nt there", fbUrl.contains("facebook"));
	}

	@Then("twitter link should be displayed in footer")
	public void twitterLinkShouldBeDisplayedInFooter() {
		String twitterUrl = homePage.getTwitterContactLink();
		MainLogger.logger().info("Twitter Page URL is " + twitterUrl);
		Assert.assertTrue("Assertion Failed : Facebook link is nt there", twitterUrl.contains("twitter"));
	}

	@When("user clicks on the shopping cart")
	public void userClicksOnTheShoppingCart() {
		homePage.clickOnCartIcon();
	}

	@When("user clicks on first product image")
	public void userClicksOnFirstProductImage() {
		homePage.clickOnFirstProductImage();
		MainLogger.logger().info("Clicks on first product image");
	}

	@When("click on the cart icon")
	public void clickOnTheCartIcon() {
		homePage.clickOnCartIcon();
		MainLogger.logger().info("Clicks on cart icon");
	}

	@And("click on the shopping cart icon")
	public void clickcartIcon() {
		homePage.clickOnCartIcon();
		MainLogger.logger().info("Clicks on cart icon");
	}


}
