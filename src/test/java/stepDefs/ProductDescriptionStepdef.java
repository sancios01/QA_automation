package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import actions.ProductDescriptionPageActions;
import logger.MainLogger;
import org.junit.Assert;

public class ProductDescriptionStepdef {
	
	private ProductDescriptionPageActions productDescriptionPageKeywords;

    public ProductDescriptionStepdef() {
        this.productDescriptionPageKeywords = new ProductDescriptionPageActions();
    }

	@Then("user can see the product description")
	public void userCanSeeTheProductDescription() {
		String productTitle = productDescriptionPageKeywords.getProductTile();
		MainLogger.logger().info("Product Tile is "+productTitle);
		Assert.assertTrue(!productTitle.isEmpty());
		MainLogger.logger().info("Assertion Passed : Product is displayed");
	}

	@When("user clicks on add to cart button")
	public void userClicksOnAddToCartButton() {
		productDescriptionPageKeywords.clickOnAddToCartButton();
	}
	
}
