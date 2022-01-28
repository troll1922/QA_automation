import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {

    public String inputText;
    public String result;
    public WebDriver driver;

    @BeforeTest
    public void setup () throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.get("https://www.google.ru/");
        Actions action = new Actions(driver);
        driver.findElement(By.name("q")).sendKeys("Калькулятор");
        // кнопка поиск
        driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
        // левая скобка
        driver.findElement(By.cssSelector("[jsname='j93WEe']")).click();
        // 1
        driver.findElement(By.cssSelector("[jsname='N10B9']")).click();
        // +
        driver.findElement(By.cssSelector("[jsname='XSr6wc']")).click();
        // 2
        driver.findElement(By.cssSelector("[jsname='lVjWed']")).click();
        // правая скобка
        driver.findElement(By.cssSelector("[jsname='qCp9A']")).click();
        // *
        driver.findElement(By.cssSelector("[jsname='YovRWb']")).click();
        // 3
        driver.findElement(By.cssSelector("[jsname='KN1kY']")).click();
        // -
        driver.findElement(By.cssSelector("[jsname='pPHzQc']")).click();
        // 4
        driver.findElement(By.cssSelector("[jsname='xAP7E']")).click();
        // 0
        driver.findElement(By.cssSelector("[jsname='bkEvMb']")).click();
        // делить
        driver.findElement(By.cssSelector("[jsname='WxTTNd']")).click();
        // 5
        driver.findElement(By.cssSelector("[jsname='Ax5wH']")).click();
        // =
        driver.findElement(By.cssSelector("[jsname='Pt8tGc']")).click();

        inputText = driver.findElement(By.cssSelector("[jsname='ubtiRe']")).getText();
        result = driver.findElement(By.cssSelector("[jsname='VssY5c']")).getText();

        Thread.sleep(3000);

    }

    @Test
    public void Test1 () {

        System.out.println(inputText);
        System.out.println(result);

        Assert.assertEquals(inputText, "(1 + 2) × 3 - 40 ÷ 5 =");

    }

    @Test
    public void Test2 () {

        System.out.println(inputText);
        System.out.println(result);

        Assert.assertEquals(result, "1");

        driver.close();
        driver.quit();
    }
}
