package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddtoPage extends AbstarctClass {

    WebDriver driver;

    public AddtoPage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/main/div/div[1]/div[1]/div[2]/div[2]/div/button")
    private WebElement search;

    public void clickSearch() {
        clickFunction(search);
    }

    @FindBy(xpath = "//*[@id=\"district-search-0\"]/input")
    private WebElement cityTextbox;

    public void sendKeyscity(String city) {
        sendKeysFunction(cityTextbox, city);
    }

    @FindBy(xpath = "//*[@id=\"district-search-0\"]/div[3]/ul/li[1]/a")
    private WebElement selectCity;

    public void selectFromCity() {
        clickFunction(selectCity);
    }

    @FindBy(xpath = "/html/body/main/div[1]/div[2]/div[1]/div/div[2]/a/picture/img")
    private WebElement flowers;

    public void selectFlowers() {
        clickFunction(flowers);
    }

    @FindBy(xpath = "/html/body/main/div/div[4]/div[1]/div/div/a")
    private WebElement product;

    public void selectProduct() {
        clickFunction(product);
    }

    @FindBy(xpath = "//*[@id=\"productDetailSend\"]/div/div/div/div[2]/div[6]/div[3]/div[1]")
    private WebElement calender;

    public void selectCalender() {
        if (calender != null)
        clickFunction(calender);
    }

    @FindBy(xpath = "//*[@id=\"productDetailSend\"]/div/div/div/div[2]/div[15]/div[5]/button")
    private WebElement cart;

    public void clickAddToCart() {
        clickFunction(cart);
    }

    @FindBy(xpath = "/html/body/main/div/form/div/div[1]/div/div[2]/div")
    private WebElement succesMessage;

    public void assertMyMessage() {
        Assertion(succesMessage, "Please note you are sending this product to Spain.");
        Driver.closeDriver();
    }
}
