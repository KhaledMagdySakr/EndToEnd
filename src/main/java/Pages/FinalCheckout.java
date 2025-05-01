package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalCheckout extends BasePage {
    public FinalCheckout(WebDriver driver) {
        super(driver);
    }
    String FinalCheckoutpagelink = "https://www.saucedemo.com/v1/checkout-step-two.html";
    By FinishButton = By.xpath("//a[@class='btn_action cart_button']");

}
