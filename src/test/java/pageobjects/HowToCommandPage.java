package pageobjects;

import org.openqa.selenium.By;

public class HowToCommandPage {

	public By btnInfo =  By.cssSelector("#top-bar-content a[href*='cum-comand']");

	public By infoHeader =  By.cssSelector("div .help-content-header");

	public By languageTopBtn = By.cssSelector(".language");

	public By languageBottomBtn = By.cssSelector(".lang-switcher");

	public By homeBtn = By.cssSelector("a[href^=\"/\"] #dynamic-logo");

}
