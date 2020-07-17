package stepdefs;

import browserfactory.DriverClass;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.HomePageKeywords;
import logger.MainLogger;
import resourcereader.ConfigPropertyReader;

import java.util.HashMap;

public class HomePageStepdef {

	private HomePageKeywords homePage;

	public HomePageStepdef() {
		this.homePage = new HomePageKeywords();
	}

	@Given("User launches the application url")
	public void navigateToLoginPage() {
		HashMap<String,String> configSettings = ConfigPropertyReader.getSessionConfig();
		DriverClass driverClass = new DriverClass();// main class for initliazing browser
		MainLogger.logger().info("Application url is "+ driverClass.getUrl(configSettings) );
		homePage.launchApplication((driverClass.getUrl(configSettings)));
	}

	@When("Enters the search term {string} in search box")
	public void enters_the_search_term_in_search_box(String string) {
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
	public void contact_email_should_displayed_in_footer() {
		String emailText = homePage.getEmailContactText();
		MainLogger.logger().info("Contact Email address is " + emailText);
		Assert.assertEquals(emailText, "info@zap.md");
	}

	@Then("facebook link should be displayed footer")
	public void facebook_link_should_be_displayed_footer() {
		String fbUrl = homePage.getFaceBookContactLink();
		MainLogger.logger().info("Facebook Page URL is " + fbUrl);
		Assert.assertTrue("Assertion Failed : Facebook link is nt there", fbUrl.contains("facebook"));
	}

	@Then("twitter link should be displayed in footer")
	public void twitter_link_should_be_displayed_in_footer() {
		String twitterUrl = homePage.getTwitterContactLink();
		MainLogger.logger().info("Twitter Page URL is " + twitterUrl);
		Assert.assertTrue("Assertion Failed : Facebook link is nt there", twitterUrl.contains("twitter"));
	}

	@When("user clicks on the shopping cart")
	public void user_clicks_on_the_shopping_cart() {
		homePage.clickOnCartIcon();
	}

	@When("user clicks on first product image")
	public void user_clicks_on_first_product_image() {
		homePage.clickOnFirstProductImage();
		MainLogger.logger().info("Clicks on first product image");
	}

	@When("click on the cart icon")
	public void click_on_the_cart_icon() {
		homePage.clickOnCartIcon();
		MainLogger.logger().info("Clicks on cart icon");
	}

	@And("click on the shopping cart icon")
	public void clickcart_icon() {
		homePage.clickOnCartIcon();
		MainLogger.logger().info("Clicks on cart icon");
	}


}
