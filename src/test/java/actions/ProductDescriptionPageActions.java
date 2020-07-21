package actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ProductDescriptionPage;


public class ProductDescriptionPageActions extends BasePage {

	/** The product description page locators. */
	private ProductDescriptionPage productDescriptionPageLocators;
	
	/**
	 * Instantiates a new product description page keywords.
	 */
	public ProductDescriptionPageActions() {
		productDescriptionPageLocators = new ProductDescriptionPage();
	}
	
	/**
	 * Click on add to cart button.
	 */
	public void clickOnAddToCartButton() {
		getElement(productDescriptionPageLocators.btnAddToCart).click();
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(getElement(productDescriptionPageLocators.cartCountIcon)));
	}
	
	/**
	 * Gets the product tile.
	 *
	 * @return the product tile
	 */
	public String getProductTile() {
		return getElement(productDescriptionPageLocators.productTitle).getText();
	}
}
