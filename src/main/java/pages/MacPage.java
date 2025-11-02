package pages;

import org.apache.commons.io.input.WindowsLineEndingInputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MacPage {
    private WebDriver driver;
    private By macLabel = By.xpath("//h1[@class='PageHeader_title__EDhKs MarcomSection_enhanced--active__QjigW animationDefaults_buildIn__OdEKA']");

    public MacPage(WebDriver driver) {
        this.driver = driver;
    }
}
