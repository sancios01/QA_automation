package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import actions.OrderPageActions;
import logger.MainLogger;
import org.junit.Assert;

public class OrderPageStepdef {
	
	private OrderPageActions orderPageKeywords;

    public OrderPageStepdef() {
        this.orderPageKeywords = new OrderPageActions();
    }

	@Then("product should be added into the cart")
	public void productShouldBeAddedIntoTheCart() {
	   String productTitle = orderPageKeywords.getProductTile();
	   Assert.assertTrue(!productTitle.isEmpty());
	   MainLogger.logger().info("Product title is "+productTitle);
	}

	@When("user click on the delete product icon")
	public void userClickOnTheDeleteProductIcon() {
	    orderPageKeywords.clickOnDeletProduct();
	    MainLogger.logger().info("Click on delete product");
	}

	@Then("product should be deleted from the cart")
	public void ProductShouldBeDeletedFromTheCart() {
		Assert.assertTrue("Cart is not empty",orderPageKeywords.getEmptyCartVisibility());
		MainLogger.logger().info("Assertion Passed : Shopping cart is empty");
	}
	
	@Then("empty cart should be displayed")
	public void emptyCartShouldBeDisplayed() {
		 Assert.assertTrue("Cart is not empty",orderPageKeywords.getEmptyCartVisibility());
		 MainLogger.logger().info("Assertion Passed : Shopping cart is empty");
	}
}
