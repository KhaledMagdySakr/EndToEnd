package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public String Checkoutpagelink = "https://www.saucedemo.com/checkout-step-one.html";
    public By FristName = By.id("first-name");
    public By LastName = By.id("last-name");
    public By PostalCode = By.id("postal-code");
    public By ContinueButton = By.xpath("//input[@id='continue']");
}
