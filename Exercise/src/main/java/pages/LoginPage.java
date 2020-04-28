package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By Username = By.id("username");
    private By Password = By.id("password");
    private By Button = By.xpath("//i[contains(@class,'fa fa-2x')]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername (String username){
        driver.findElement(Username).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(Password).sendKeys(password);
    }
    public SecurePage ClickButton() {
        driver.findElement(Button).click();
        return new SecurePage(driver);
    }

}
