package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.awt.*;

public class BaseTests{
    WebDriver driver = new EdgeDriver();
    BasePage B = new BasePage(driver);
    LoginPage L = new LoginPage(driver);
    inventoryPage I = new inventoryPage(driver);
    CartPage Cart = new CartPage(driver);
    CheckoutPage Checkout = new CheckoutPage(driver);
    FinalCheckout Final = new FinalCheckout(driver);
    ThankyouPage Thankyou = new ThankyouPage(driver);
 @DataProvider(name = "loginData")
public Object[][] loginData() throws Exception {
    ExcelReader excelReader = new ExcelReader();
    return excelReader.getExcelData();
}
    @BeforeClass
    public void setup() {
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
    }
    @Test()
    public void EndtoEndTest() {
        B.wait(5);
        B.typeText(L.username,"standard_user");
        B.typePassword(L.password,"secret_sauce");
        B.clickButton(L.loginButton);
        B.wait(5);
        B.clickButton(I.SauceLabsBackpack);
        B.clickButton(I.SauceLabsFleeceJacket);
        B.clickButton(I.Cartbutton);
        B.wait(5);
        B.verifyUrl(Cart.Cartpagelink);
        B.clickButton(Cart.Checkoutbutton);
        B.wait(5);
        B.verifyUrl(Checkout.Checkoutpagelink);
        B.typeText(Checkout.FristName,"mohamed");
        B.typeText(Checkout.LastName,"tal3at");
        B.typeText(Checkout.PostalCode,"22512");
        B.clickButton(Checkout.ContinueButton);
        B.wait(5);
        B.verifyUrl(Final.FinalCheckoutpagelink);
        B.clickButton(Final.FinishButton);
        B.verifyText(Thankyou.ThankYouPath,Thankyou.ThankYouText);
    }

    @AfterClass
    public void tearDown() {
    driver.quit();
    }
}