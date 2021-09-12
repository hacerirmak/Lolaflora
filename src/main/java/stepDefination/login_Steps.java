package stepDefination;

import constants.ProjectConstants;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjectModel.LoginPage;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class login_Steps {

    private WebDriver driver;
    LoginPage loginPage = new LoginPage();

    @Given("Navigate to login page")
    public void navigateToLoginPage() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ProjectConstants.WEBSITE_URL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Login page is opened");

    }

    @And("Enter the  user email")
    public void enterTheUserEmail() throws Throwable {
        loginPage.sendKeysemailInput();
        System.out.println("User email entered");
    }

    @And("Enter the user password")
    public void enterTheUserPassword() throws Throwable {
        loginPage.sendKeyspasswordInput();
        System.out.println("User password entered");
    }

    @When("Click login button")
    public void clickLoginButton() throws Throwable {
        loginPage.clickLogin();
        System.out.println("Login button clicked");
    }

    @Then("Successful login is check")
    public void successfulLoginIsCheck() throws Throwable {
        loginPage.assertMyMessage();
        System.out.println("Successful Login");
    }

    @Given("Enter the wrong pasword")
    public void enter_the_wrong_pasword() {
        loginPage.sendKeyswrongPasswordInput();
        System.out.println("User wrong password entered");
    }

    @Then("Login failed")
    public void loginFailed() {
        loginPage.assertMyFailMessage();
        System.out.println("Login Failed");
    }
}

