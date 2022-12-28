package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {
   /* @Given("user navigates to HRMS application")
    public void user_navigates_to_hrms_application() {
       openBrowserAndLaunchApp();
    }*/


    @When("user enters valid username and valid password")
    public void user_enters_valid_username_and_valid_password() {
       // sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));
        sendText(login.usernameTextField,ConfigReader.getPropertyValue("username"));
       // WebElement passwordField=driver.findElement(By.id("txtPassword"));
        //sendText(login.passwordTextField, ConfigReader.getPropertyValue("password"));
        sendText(login.passwordTextField,ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(login.loginButton);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("We logged in successfully");


}
}