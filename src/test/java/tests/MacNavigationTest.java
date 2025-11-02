package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utils.DriverFactory;

public class MacNavigationTest {
    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get("https://www.apple.com");
        homePage = new HomePage(driver);
    }

    @Test
    public void testNavigateToMacPage() {
        homePage.clickMacLink();
        Assert.assertTrue(driver.getCurrentUrl().contains("/mac"), "Mac page did not load correctly.");
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}