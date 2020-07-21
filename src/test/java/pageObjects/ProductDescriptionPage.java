package pageObjects;

import org.openqa.selenium.By;

public class ProductDescriptionPage {

	public By btnAddToCart =  By.cssSelector("[class=\"add-to-cart-text\"]");
	
	public By productTitle =  By.cssSelector("[class='product-title'] h1");
	
	public By cartCountIcon = By.cssSelector("[id='cart-items'][class='circled empty full']");

}
