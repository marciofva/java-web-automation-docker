package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "passwd")
    private WebElement passwordInput;

    @FindBy(id = "SubmitLogin")
    private WebElement submitBtn;

    public HomePage submitLogin(String email, String password) {
        sendValue(emailInput, email);
        sendValue(passwordInput, password);
        clickOn(submitBtn);
        return new HomePage(driver);
    }
}
