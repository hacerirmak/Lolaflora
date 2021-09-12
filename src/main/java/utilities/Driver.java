package utilities;

import constants.ProjectConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            System.setProperty(ProjectConstants.DRIVER_NAME, ProjectConstants.DRIVER_PATH);
            driver = new ChromeDriver();
        }

        return driver;
    }
   public static void closeDriver() {

       if (driver != null) {
           driver.quit();
            driver = null;
        }
    }
}
