package Testing;
import org.openqa.selenium.By;
import org.testng.annotations.*;
public class BaseTests extends BasePage{

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
        wait(5);
        typeText(By.id("user-name"),"standard_user");
        typePassword(By.id("password"),"secret_sauce");
        clickButton(By.id("login-button"));
        wait(5);
        clickButton(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
        verifyAddToCart();
        clickButton(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
        wait(5);
        verifCartIsclicked("https://www.saucedemo.com/v1/cart.html");
        clickButton(By.xpath("//a[@class='btn_action checkout_button']"));
        wait(5);
        verifyCheckoutButton("https://www.saucedemo.com/v1/checkout-step-one.html");
        typeText(By.id("first-name"),"mohamed");
        typeText(By.id("last-name"),"tal3at");
        typeText(By.id("postal-code"),"22512");
        clickButton(By.xpath("//input[@value='CONTINUE']"));
        wait(5);
        clickButton(By.xpath("//a[@class='btn_action cart_button']"));
        verefyCheckoutFinsh();
    }

    @AfterClass
    public void tearDown() {
    driver.quit();
    }
}