package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinalCheckout extends BasePage {
    public FinalCheckout(WebDriver driver) {
        super(driver);
    }
    public String FinalCheckoutpagelink = "https://www.saucedemo.com/checkout-step-two.html";
    public By FinishButton = By.xpath("//button[@id='finish']");

}
