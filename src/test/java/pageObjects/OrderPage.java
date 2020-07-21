package pageObjects;

import org.openqa.selenium.By;

public class OrderPage {

	/**
	 * Search Box
	 */
	public By noProduct =  By.cssSelector("[class='no_products']");
	
	public By deleteProduct =  By.cssSelector("td[class=\"remove\"] a");
	
	public By productTitle = By.cssSelector("[class=\"order-description\"] td[class=\"product\"] a");
	
}
