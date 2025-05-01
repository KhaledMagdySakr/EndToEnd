package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import java.time.Duration;

public class BasePage {
    WebDriver driver = new EdgeDriver();
    By removeBack=By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)");
    By orderFinish=By.xpath("//h2[@class='complete-header']");

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

    public void verifyAddToCart() {
        driver.findElement(removeBack).isDisplayed();
    }

    public void verifCartIsclicked(String redirectedURL) {
        Assert.assertEquals(redirectedURL, driver.getCurrentUrl());

    }

    public void verifyCheckoutButton(String redirectedURL) {
        Assert.assertEquals(redirectedURL, driver.getCurrentUrl());
    }
    public void verefyCheckoutFinsh(){
        Assert.assertEquals(driver.findElement(orderFinish).getText(),"THANK YOU FOR YOUR ORDER");
    }



}

