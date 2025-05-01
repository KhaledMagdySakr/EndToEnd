package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThankyouPage extends BasePage {
    public ThankyouPage(WebDriver driver) {
        super(driver);
    }
    By ThankYouPath=By.xpath("//h2[@class='complete-header']");
    String ThankYouText="THANK YOU FOR YOUR ORDER";
}
