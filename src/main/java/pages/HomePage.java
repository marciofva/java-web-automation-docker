package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a.login")
    private WebElement loginLink;

    public LoginPage goToLoginPage(){
        clickOn(loginLink);
        return new LoginPage(driver);
    }
}
