package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    String Checkoutpagelink = "https://www.saucedemo.com/v1/checkout-step-one.html";
    By FristName = By.id("first-name");
    By LastName = By.id("last-name");
    By PostalCode = By.id("postal-code");
    By ContinueButton = By.xpath("//input[@value='CONTINUE']");
}
