package pageObjectModel;

import constants.ProjectConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage extends AbstarctClass {

    WebDriver driver;

    public LoginPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"EmailLogin\"]")
    private WebElement emailInput;

    public void sendKeysemailInput() {
        sendKeysFunction(emailInput, ProjectConstants.E_MAIL);
    }

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement passwordInput;

    public void sendKeyspasswordInput() {
        sendKeysFunction(passwordInput, ProjectConstants.PASSWORD);
    }

    @FindBy(xpath = "//*[@id=\"userLogin\"]/div[6]/button")
    private WebElement SignIn;

    public void clickLogin() {
        clickFunction(SignIn);
    }

    @FindBy(xpath = "//*[@id=\"Password\"]")
    private WebElement wrongPasswordinput;

    public void sendKeyswrongPasswordInput() {
        sendKeysFunction(wrongPasswordinput, ProjectConstants.WRONG_PASSWORD);
    }

    @FindBy(xpath = "/html/body/main/div/div[1]/div[1]/div[2]/div[2]/div/button")
    private WebElement succesMessage;

    public void assertMyMessage() {
        Assertion(succesMessage, "Search for a district or a street");
    }

    @FindBy(xpath = "//*[@id=\"modalBox\"]/div/div/div[2]")
    private WebElement failMessage;

    public void assertMyFailMessage() {
        Assertion(failMessage, "E-mail address or password is incorrect. Please check your information and try again.");
    }
}
