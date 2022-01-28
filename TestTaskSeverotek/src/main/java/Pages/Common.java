package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Common {

    public static WebDriver driver = null;

    public static void initDriver () {
        if (driver == null) {
            if (Config.browserName.equalsIgnoreCase(Constants.chrome)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if (Config.browserName.equalsIgnoreCase(Constants.firefox)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else System.out.println("Incorrect Browser name or platform");
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Config.implicitlyTime));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Config.pageLoadTime));
            driver.manage().window().maximize();
            }
    }

    public static void quit () {
        System.out.println("quitting the browser");
        driver.quit();
        driver = null;
    }
}
