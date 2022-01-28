package Base.Pages;

import Base.Common;
import Base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AdminPanelPage {

    protected static WebElement dashboardTitle = Common.driver.findElement(By.className("dashboard-title"));
    protected static WebElement entryAdd = Common.driver.findElement(By.xpath("//a[@href='/admin/blog/entry/add/']"));
    public static WebDriverWait wait = new WebDriverWait(Common.driver, Duration.ofSeconds(Config.explicitlyTime));

    public static String getTextDashboardTitle () {
        wait.until(ExpectedConditions.visibilityOf(dashboardTitle));
        return dashboardTitle.getText();
    }

    public static void entryAdd () {
        entryAdd.click();
    }
}
