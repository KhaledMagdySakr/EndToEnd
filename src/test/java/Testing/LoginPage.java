package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By username=By.id("user-name");
    By password=By.id("password");
    By loginButton=By.id("login-button");
}