// pages/HomePage.java
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By searchIcon = By.id("globalnav-menubutton-link-search");
    private By searchInput = By.id("globalnav-search-input");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSearchIcon() {
        driver.findElement(searchIcon).click();
    }

    public void search(String keyword) {
        driver.findElement(searchInput).sendKeys(keyword);
        driver.findElement(searchInput).submit();
    }
}