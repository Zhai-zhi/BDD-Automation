package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecurePage;

public class LoginTest extends BaseTests {
    @Test
    public void testLogin(){
        LoginPage loginPage = homePage.clickHomePage();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecurePage securePage = loginPage.ClickButton();
        System.out.println(securePage.getText());
    }
}
