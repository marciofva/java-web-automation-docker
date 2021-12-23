package tests;

import helper.BrowserFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;

public class BaseTest {

    protected LoginPage login;

    @BeforeEach
    public void setup() throws IllegalAccessException, MalformedURLException {
        String browser = "REMOTE";
        BrowserFactory.setDriver(BrowserFactory.createBrowserInstance(browser));
        BrowserFactory.getDriver().get("http://automationpractice.com/");
        login = new HomePage(BrowserFactory.getDriver()).goToLoginPage();
    }

    @AfterEach
    public void teardown(){
        BrowserFactory.getDriver().close();
    }
}
