package stepdefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import keywords.OrderPageKeywords;
import logger.MainLogger;
import org.junit.Assert;

public class OrderPageStepdef {
	
	private OrderPageKeywords orderPageKeywords;


    public OrderPageStepdef() {
        this.orderPageKeywords = new OrderPageKeywords();
    }

	@Then("product should be added into the cart")
	public void product_should_be_added_into_the_cart() {
	   String productTitle = orderPageKeywords.getProductTile();
	   Assert.assertTrue(!productTitle.isEmpty());
	   MainLogger.log("Product title is "+productTitle, this.getClass());
	}

	@When("user click on the delete product icon")
	public void user_click_on_the_delete_product_icon() {
	    orderPageKeywords.clickOnDeletProduct();
	    MainLogger.log("Click on delete product", this.getClass());
	}

	@Then("product should be deleted from the cart")
	public void product_should_be_deleted_from_the_cart() {
		Assert.assertTrue("Cart is not empty",orderPageKeywords.getEmptyCartVisibility());
		MainLogger.log("Assertion Passed : Shopping cart is empty", this.getClass());
	}
	
	@Then("empty cart should be displayed")
	public void empty_cart_should_be_displayed() {
		 Assert.assertTrue("Cart is not empty", orderPageKeywords.getEmptyCartVisibility());
	}
}
