package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.HomePageKeywords;
import logger.MainLogger;
import org.junit.Assert;

public class HomePageStepdef {

	private HomePageKeywordshomePage;

	public HomePageStepdef() {
		this.homePage = new HomePageKeywords();
	}

	@Given("User launches the application url")
	public void navigateToLoginPage() {
		MainLogger.logger().info("Application url is " + homePage.testData.getData("app_url"));
		homePage.launchApplication(homePage.testData.getData("app_url"));
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
