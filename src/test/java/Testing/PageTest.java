package Testing;

import Pages.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PageTest extends BaseTests {
    SoftAssert softAssert;
    LoginPage L;
    inventoryPage I;
    CartPage Cart;
    CheckoutPage Checkout;
    FinalCheckout Final;
    ThankyouPage Thankyou;

    @DataProvider(name = "ValidData")
    public Object[][] loginData() throws Exception {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData();
    }

    @Test(priority = 0, dataProvider = "ValidData")
    public void LoginPage(String username, String password) {
        L = new LoginPage(driver); /* Always initiate new driver*/
        softAssert = new SoftAssert();
        Assert.assertTrue(L.checkLoginPgTitle());
        L.checkPgTitleValue();
        L.setUsername(username);
        L.setPassword(password);
        L.clickOnLogin();
    }

    @Test(priority = 1)
    public void iverntory() throws InterruptedException {
        I = new inventoryPage(driver);
        I.wait(5);
        I.ckeckProductsTitle();
        I.checkingTitleValue();
        I.clickAddToCart();
        Thread.sleep(2000);
        I.clickOnCartIcon();
    }

    @Test(priority = 2)
    public void Cart() {
        Cart = new CartPage(driver);
        Cart.wait(5);
        Cart.verifyUrl(Cart.Cartpagelink);
        Cart.clickButton(Cart.Checkoutbutton);
    }

    @Test(priority = 3)
    public void Checkout() {
        Checkout = new CheckoutPage(driver);
        Checkout.wait(5);
        Checkout.verifyUrl(Checkout.Checkoutpagelink);
        Checkout.typeText(Checkout.FristName, "mohamed");
        Checkout.typeText(Checkout.LastName, "tal3at");
        Checkout.typeText(Checkout.PostalCode, "22512");
        Checkout.clickButton(Checkout.ContinueButton);
    }
    @Test(priority = 4)
    public void FinalCheckout() {
        Final = new FinalCheckout(driver);
        Final.wait(5);
        Final.verifyUrl(Final.FinalCheckoutpagelink);
        Final.clickButton(Final.FinishButton);
    }
    @Test(priority = 5)
    public void Thankyou() {
        Thankyou = new ThankyouPage(driver);
        Thankyou.verifyUrl(Thankyou.ThankYouPagelink);
        Thankyou.verifyText(Thankyou.ThankYouPath, Thankyou.ThankYouText);
    }
}
