package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    public String Cartpagelink = "https://www.saucedemo.com/cart.html";
    public By Checkoutbutton = By.xpath("//button[@id='checkout']");
}
