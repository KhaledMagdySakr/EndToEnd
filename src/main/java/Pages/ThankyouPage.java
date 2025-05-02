package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankyouPage extends BasePage {
    public ThankyouPage(WebDriver driver) {
        super(driver);
    }
    public String ThankYouPagelink="https://www.saucedemo.com/checkout-complete.html";
    public By ThankYouPath=By.xpath("//h2[@class='complete-header']");
    public String ThankYouText="Thank you for your order!";
}
