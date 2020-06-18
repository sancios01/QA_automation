import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Zappfunctionality{

    WebDriver driver;

    @Given("I lounch chrome browser")
        System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");
        WebDriver wd =new ChromeDriver();
    }

    @When("I open zap hamepage")
    public void i_open_zap_hamepage() {
        driver.get("https://www.zap.md/")
    }

    @Then("I verify that the logo present on page")
    public void i_verify_that_the_logo_present_on_page() {
        boolean status = driver.findElement(By.xpath("//*[@id=\"dynamic-logo\"]")).isDisplayed();
        Assert.assertEquals(true,starus);
    }

    @Then("clouse browser")
    public void clouse_browser() {
        driver.quit();
    }


}