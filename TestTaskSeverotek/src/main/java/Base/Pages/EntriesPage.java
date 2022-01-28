package Base.Pages;

import Base.Common;
import Base.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.List;

public class EntriesPage {

    protected static List<WebElement> listEntry = Common.driver.findElements(By.cssSelector(".row1"));
    protected static List<WebElement> listOption = Common.driver.findElements(By.cssSelector("[name='action']"));

    public static void clickCheckBoxEntry () {
        for (WebElement entry : listEntry) {
            if (entry.getText().contains(Data.formTitle)) {
                entry.findElement(By.name("_selected_action")).click();
                break;
            }
        }
    }

    public static void chooseOption () {

    }

}
