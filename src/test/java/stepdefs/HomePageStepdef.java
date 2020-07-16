package stepdefs;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.HomePageKeywords;
import logger.MainLogger;

public class HomePageStepdef {

	private HomePageKeywords homePage;

	public HomePageStepdef() {
		this.homePage = new HomePageKeywords();
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
