package Base.Pages;

import Base.Common;
import Base.Config;
import Base.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class EntriesPage {

    protected static List<WebElement> listEntry = Common.driver.findElements(By.cssSelector(".row1"));
    protected static WebElement option = Common.driver.findElement(By.cssSelector("[name='action']"));
    protected static WebElement deleteButton = Common.driver.findElement(By.cssSelector(".button[name='index']"));

    public static void clickCheckBoxEntry () {
        for (WebElement entry : listEntry) {
            if (entry.getText().contains(Data.formTitle)) {
                entry.findElement(By.name("_selected_action")).click();
                break;
            }
        }
    }

    public static void chooseDeleteOption () {
        Select options = new Select(option);
        options.selectByValue("delete_selected");
    }

    public static void clickButtonDelete () {
        deleteButton.click();
    }

    public static void clickConfirmButton () {
        WebElement confirmButton = Common.driver.findElement(By.cssSelector("div>input[type='submit']"));
        confirmButton.click();
    }

    public static void deleteEntry () {
        clickCheckBoxEntry();
        chooseDeleteOption();
        clickButtonDelete();
        clickConfirmButton();
    }
}
