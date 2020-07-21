package keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.ProductDescriptionPageLocators;

public class ProductDescriptionPageKeywords extends BasePage {

	private ProductDescriptionPageLocators productDescriptionPageLocators;

	public ProductDescriptionPageKeywords() {
		productDescriptionPageLocators = new ProductDescriptionPageLocators();
	}

	public void clickOnAddToCartButton() {
		getElement(productDescriptionPageLocators.btnAddToCart).click();

		WebElement webElement = getElement(productDescriptionPageLocators.cartCountIcon);
		ExpectedCondition<WebElement> expectedCondition = ExpectedConditions.visibilityOf(webElement);
		new WebDriverWait(driver, 30).until(expectedCondition);
	}

	public String getProductTile() {
		return getElement(productDescriptionPageLocators.productTitle).getText();
	}
}
