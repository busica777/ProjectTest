package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement usernameTextField;

    @FindBy(id="txtPassword")
    public WebElement passwordTextField;

    @FindBy(id="btnLogin")
    public WebElement loginButton;

    @FindBy(id="btnLogin")
    public WebElement errorMessage;

    public LoginPage() {
       PageFactory.initElements(driver, this);

    }
}