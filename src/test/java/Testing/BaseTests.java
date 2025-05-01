package Testing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.awt.*;
import java.time.Duration;

public class BaseTests{
 WebDriver driver;

 @DataProvider(name = "loginData")
public Object[][] loginData() throws Exception {
    ExcelReader excelReader = new ExcelReader();
    return excelReader.getExcelData();
}
    @BeforeClass
    public void setup() {
     driver = new EdgeDriver();
        driver.get("https://www.saucedemo.com");
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }


    @AfterClass
    public void tearDown() {
    driver.quit();
    }
}