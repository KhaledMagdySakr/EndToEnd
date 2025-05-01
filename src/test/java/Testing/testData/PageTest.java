package Testing.testData;

import Testing.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class PageTest extends BaseTests {
    WebDriver driver = new EdgeDriver();
    BasePage B = new BasePage(driver);
    LoginPage L = new LoginPage(driver);
    inventoryPage I = new inventoryPage(driver);
    CartPage Cart = new CartPage(driver);
    CheckoutPage Checkout = new CheckoutPage(driver);
    FinalCheckout Final = new FinalCheckout(driver);
    ThankyouPage Thankyou = new ThankyouPage(driver);


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
}
