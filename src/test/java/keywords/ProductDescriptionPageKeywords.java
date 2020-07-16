package keywords;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.ProductDescriptionPageLocators;

// TODO: Auto-generated Javadoc

/**
 * The Class ProductDescriptionPageKeywords.
 */
public class ProductDescriptionPageKeywords extends BasePage {

	/** The product description page locators. */
	private ProductDescriptionPageLocators productDescriptionPageLocators;
	
	/**
	 * Instantiates a new product description page keywords.
	 */
	public ProductDescriptionPageKeywords() {
		productDescriptionPageLocators = new ProductDescriptionPageLocators();
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
