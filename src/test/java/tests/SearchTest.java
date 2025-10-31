// tests/SearchTest.java
package tests;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverFactory;

public class SearchTest {
    WebDriver driver;
    HomePage home;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("https://www.apple.com");
        home = new HomePage(driver);
    }

    @Test
    public void testSearchiPhone() {
        home.clickSearchIcon();
        home.search("iPhone 15");
        assert driver.getPageSource().contains("iPhone 15");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}