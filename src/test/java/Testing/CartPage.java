package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    String Cartpagelink = "https://www.saucedemo.com/v1/cart.html";
    By Checkoutbutton = By.xpath("//a[@class='btn_action checkout_button']");
}
