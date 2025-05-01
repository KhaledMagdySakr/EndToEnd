package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import java.time.Duration;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void typeText(By field,String username){
        driver.findElement(field).sendKeys(username);
    }
    public void typePassword(By field,String password){
        driver.findElement(field).sendKeys(password);
    }
    public void clickButton(By button){
        driver.findElement(button).click();
    }
    public void wait(int seconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public void verifyUrl(String redirectedURL) {
        Assert.assertEquals(redirectedURL, driver.getCurrentUrl());
    }
    public void verifyText(By element , String expectedText) {
        Assert.assertEquals(driver.findElement(element).getText(),expectedText);
    }



}

