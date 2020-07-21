package keywords;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.OrderPageLocators;

public class OrderPageKeywords extends BasePage {

	private OrderPageLocators orderPageLocators;

	public OrderPageKeywords() {
		orderPageLocators = new OrderPageLocators();
	}

	public void clickOnDeletProduct() {
		WebElement webElement = getElement(orderPageLocators.deleteProduct);
		ExpectedCondition<WebElement> expectedCondition = ExpectedConditions.visibilityOf(webElement);
		new WebDriverWait(driver, 30).until(expectedCondition);
		clickUsingJS(webElement);
	}

	public String getProductTile() {
		return getElement(orderPageLocators.productTitle).getText();
	}

	public boolean getEmptyCartVisibility() {
		return getElement(orderPageLocators.noProduct).isDisplayed();
	}
}
