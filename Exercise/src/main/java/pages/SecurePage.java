package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private WebDriver driver;
    private By alert = By.id("flash");

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    public String getText(){
        return driver.findElement(alert).getText();
    }
}
