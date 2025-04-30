package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    By addTocart=By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]");
    By removeBack=By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > button:nth-child(2)");
    By cart_link =By.xpath("//*[name()='path' and contains(@fill,'currentCol')]");
   By checkout_button= By.xpath("//a[@class='btn_action checkout_button']");
    String user_name="standard_user";
    String password="<PASSWORD>";

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }


    public void ClickAddToCart() {
        driver.findElement(addTocart).click();
    }

    public void verifyAddToCart() {
        driver.findElement(removeBack).isDisplayed();
    }

    public void clickCartLink() {
        driver.findElement(cart_link).click();
    }

    public void verifCartIsclicked(String redirectedURL) {
        Assert.assertEquals(redirectedURL, driver.getCurrentUrl());

    }

    public void clickCheckoutButton() {
        driver.findElement(checkout_button).click();
    }

    public void verifyCheckoutButton(String redirectedURL) {
        Assert.assertEquals(redirectedURL, driver.getCurrentUrl());
    }
}

