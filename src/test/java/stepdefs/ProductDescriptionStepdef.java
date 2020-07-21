package stepdefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.ProductDescriptionPageKeywords;
import logger.MainLogger;

public class ProductDescriptionStepdef {

	private ProductDescriptionPageKeywords productDescriptionPageKeywords;

	public ProductDescriptionStepdef() {
		this.productDescriptionPageKeywords = new ProductDescriptionPageKeywords();
	}

	@Then("user can see the product description")
	public void user_can_see_the_product_description() {
		String productTitle = productDescriptionPageKeywords.getProductTile();
		MainLogger.log("Product Tile is "+productTitle, this.getClass());
		Assert.assertTrue(!productTitle.isEmpty());
		MainLogger.log("Assertion Passed : Product is displayed", this.getClass());
	}

	@When("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		productDescriptionPageKeywords.clickOnAddToCartButton();
	}

}
