/*
 * 
 */
package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.OrderPage;


public class OrderPageActions extends BasePage {


	private OrderPage orderPageLocators;
	

	public OrderPageActions() {
		orderPageLocators = new OrderPage();
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
