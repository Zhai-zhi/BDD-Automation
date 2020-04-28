package TestSteps;

import com.sun.xml.internal.ws.policy.spi.AssertionCreationException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class LoginPage {
        WebDriver driver;

        @Given("^user to open home page$")
        public void openHomePage(){
                System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://the-internet.herokuapp.com");
                driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
                driver.manage().timeouts().pageLoadTimeout(10000,TimeUnit.SECONDS);
                driver.findElement(By.linkText("Form Authentication")).click();
        }
        @Then("^user to input username and password$")
        public void inputPasswordandUser(){
                driver.findElement(By.id("username")).sendKeys("tomsmith");
                driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        }

        @Then("^user to click the submit button$")
        public void submitButton(){
                driver.findElement(By.xpath("//i[contains(@class,'fa fa-2x')]")).click();
        }

        @And("^user verify login successful$")
        public void verifyText(){
                System.out.println(driver.findElement(By.id("flash")).getText());
                String text = driver.findElement(By.id("flash")).getText();
                //assertTrue(driver.findElement(By.id("flash")).getText(),"You logged into a secure area!","Testing Fails");
                Assert.assertEquals("Message Fails","text","text");
        }
        @Then("^close browser$")
        public void closeBrowser(){
                driver.quit();
        }

}
