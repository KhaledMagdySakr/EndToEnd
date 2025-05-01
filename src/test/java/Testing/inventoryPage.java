package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inventoryPage extends BasePage{
    public inventoryPage(WebDriver driver) {
        super(driver);
    }
        By SauceLabsBackpack = By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]");
        By SauceLabsFleeceJacket = By.xpath("//div[4]//div[3]//button[1]");
        By Cartbutton = By.xpath("//*[name()='path' and contains(@fill,'currentCol')]");

}
