package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

public class BasePage {
    private WebDriver driver;
    private WebDriverWait wait;

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
    public void waitUntilElementIsVisible(By by, int time){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void waitUntilElementIsClickable(By by,int time){
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void elementsList(By by,int i){
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        List<WebElement> elements= driver.findElements(by);
        elements.get(i).click();
    }
    public int getElementsListSize(By by) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        List<WebElement> elements = driver.findElements(by);
        return elements.size();
    }
    public boolean checkingDisplay(By by){
        return driver.findElement(by).isDisplayed();
    }
}

