package stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.HomePageKeywords;
import logger.MainLogger;
import resourcereader.YmlReader;

public class HomePageStepdef {

	private final String FILE_PATH = "src/test/resources/testdata/testdata.yml";

	private HomePageKeywords homePage;

	public HomePageStepdef() {
		homePage = new HomePageKeywords();
	}// construnctor


	@Given("User launches the application url")
	public void navigateToLoginPage() {
		String url = YmlReader.getYmlValue("app_url", FILE_PATH).toString();
		homePage.launchApplication(url);
	}

	@Given("User launches the fanatstic application url")
	public void navigateToLoginPageFantastic() {
		String url = YmlReader.getYmlValue("app_url2", FILE_PATH).toString();
		homePage.launchApplication(url);
	}



	@When("Enters the search term {string} in search box")
	public void enters_the_search_term_in_search_box(String string) {
		homePage.enterTextInSearchBox(string);
		homePage.getSearchResultHeaderResult();
		MainLogger.log("Enter term "+string+" in search box" , this.getClass());
	}

	@Then("products images should displayed after search")
	public void verifySearchResultCount() {
		int totalProductInPage = homePage.getNumberOfSearchResult();
		Assert.assertTrue("No search result displayed on page",totalProductInPage > 0);
		MainLogger.log("Total product in cart " + totalProductInPage, this.getClass());
	}

	@Then("contact email should displayed in footer")
	public void contact_email_should_displayed_in_footer() {
		String emailText = homePage.getEmailContactText();
		MainLogger.log("Contact Email address is " + emailText, this.getClass());
		Assert.assertEquals(emailText, YmlReader.getYmlValue("contact_email", FILE_PATH).toString());
	}

	@Then("facebook link should be displayed footer")
	public void facebook_link_should_be_displayed_footer() {
		String fbUrl = homePage.getFaceBookContactLink();
		MainLogger.log("Facebook Page URL is " + fbUrl, this.getClass());
		Assert.assertTrue("Assertion Failed : Facebook link is nt there", fbUrl.contains("facebook"));
	}

	@Then("twitter link should be displayed in footer")
	public void twitter_link_should_be_displayed_in_footer() {
		String twitterUrl = homePage.getTwitterContactLink();
		MainLogger.log("Twitter Page URL is " + twitterUrl, this.getClass());
		Assert.assertTrue("Assertion Failed : Facebook link is nt there", twitterUrl.contains("twitter"));
	}

	@When("user clicks on the shopping cart")
	public void user_clicks_on_the_shopping_cart() {
		homePage.clickOnCartIcon();
	}

	@When("user clicks on first product image")
	public void user_clicks_on_first_product_image() {
		homePage.clickOnFirstProductImage();
		MainLogger.log("Clicks on first product image", this.getClass());
	}

	@When("click on the cart icon")
	public void click_on_the_cart_icon() {
		homePage.clickOnCartIcon();
		MainLogger.log("Clicks on cart icon", this.getClass());
	}

	@And("click on the shopping cart icon")
	public void clickcart_icon() {
		homePage.clickOnCartIcon();
		MainLogger.log("Clicks on cart icon", this.getClass());
	}
}
