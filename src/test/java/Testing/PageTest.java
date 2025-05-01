package Testing;

import Pages.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PageTest extends BaseTests {

LoginPage L;
inventoryPage I;
CartPage Cart ;
CheckoutPage Checkout ;
FinalCheckout Final ;
ThankyouPage Thankyou;

    @DataProvider(name = "ValidData")
    public Object[][] loginData() throws Exception {
        ExcelReader excelReader = new ExcelReader();
        return excelReader.getExcelData();
    }

    @Test(priority = 0,dataProvider = "ValidData")
    public void LoginPage(String username , String password) {
        L = new LoginPage(driver); /* Always initiate new driver*/

        L.setUsername(username);
        L.setPassword(password);
        L.clickOnLogin();
        L.setTimer(5);

//        B.wait(5);
//        B.clickButton(I.SauceLabsBackpack);
//        B.clickButton(I.SauceLabsFleeceJacket);
//        B.clickButton(I.Cartbutton);
//        B.wait(5);
//        B.verifyUrl(Cart.Cartpagelink);
//        B.clickButton(Cart.Checkoutbutton);
//        B.wait(5);
//        B.verifyUrl(Checkout.Checkoutpagelink);
//        B.typeText(Checkout.FristName,"mohamed");
//        B.typeText(Checkout.LastName,"tal3at");
//        B.typeText(Checkout.PostalCode,"22512");
//        B.clickButton(Checkout.ContinueButton);
//        B.wait(5);
//        B.verifyUrl(Final.FinalCheckoutpagelink);
//        B.clickButton(Final.FinishButton);
//        B.verifyText(Thankyou.ThankYouPath,Thankyou.ThankYouText);
    }
}
