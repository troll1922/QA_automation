package Base.Pages;

import Base.Common;
import Base.Config;
import Base.Data;
import io.qameta.allure.Step;
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
    protected static String linkEntry;

    public static void clickCheckBoxEntry () {
        for (WebElement entry : listEntry) {
            if (entry.getText().contains(Data.formTitle)) {
                linkEntry = entry.findElement(By.tagName("a")).getAttribute("href");
                entry.findElement(By.name("_selected_action")).click();
                break;
            }
        }
    }

    public static Boolean isLinkEntry () {
        for (WebElement entry : Common.driver.findElements(By.cssSelector(".row1"))) {
            if ((entry.getText().contains(Data.formTitle)) &&
                    linkEntry.equalsIgnoreCase(entry.findElement(By.tagName("a")).getAttribute("href"))) {
                return true;
            }
        }
        return false;
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

    @Step ("Удаляем ранее созданную запись")
    public static void deleteEntry () {
        clickCheckBoxEntry();
        chooseDeleteOption();
        clickButtonDelete();
        clickConfirmButton();
    }


}
