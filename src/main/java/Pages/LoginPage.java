package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By usernameField=By.id("user-name");
    By passwordField =By.id("password");
    By loginButton=By.id("login-button");
    By pageTitle = By.xpath("//div[@class='login_logo']");

    public boolean checkLoginPgTitle(){
        waitUntilElementIsVisible(pageTitle,10);
        return checkingDisplay(pageTitle);
    }
    public void checkPgTitleValue(){
        waitUntilElementIsVisible(pageTitle,10);
        verifyText(pageTitle,"Swag Labs");
    }


   public void setUsername(String username){
       waitUntilElementIsVisible(usernameField,5);
       typeText(usernameField,username);
   }
    public void setPassword(String password){
    waitUntilElementIsVisible(passwordField,5);
       typeText(passwordField,password);
    }
    public void clickOnLogin(){
       waitUntilElementIsClickable(loginButton,5);
       clickButton(loginButton);
    }
    public void setTimer(int i){
       wait(i);
    }


}