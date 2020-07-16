/*
 * 
 */
package keywords;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.OrderPageLocators;

// TODO: Auto-generated Javadoc

/**
 * The Class OrderPageKeywords.
 */
public class OrderPageKeywords extends BasePage {

	/** The order page locators. */
	private OrderPageLocators orderPageLocators;
	
	/**
	 * Instantiates a new order page keywords.
	 */
	public OrderPageKeywords() {
		orderPageLocators = new OrderPageLocators();
	}
	
	/**
	 * Click on delet product.
	 */
	public void clickOnDeletProduct() {
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(getElement(orderPageLocators.deleteProduct)));
		clickUsingJS(getElement(orderPageLocators.deleteProduct));
	}
	
	/**
	 * Gets the product tile.
	 *
	 * @return the product tile
	 */
	public String getProductTile() {
		return getElement(orderPageLocators.productTitle).getText();
	}
	
	/**
	 * Gets the empty cart visibility.
	 *
	 * @return the empty cart visibility
	 */
	public boolean getEmptyCartVisibility() {
		return getElement(orderPageLocators.noProduct).isDisplayed();
	}
}
