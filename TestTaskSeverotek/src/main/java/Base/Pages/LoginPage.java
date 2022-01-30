package Base.Pages;

import Base.Common;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

    protected static WebElement login = Common.driver.findElement(By.id("id_username"));
    protected static WebElement password = Common.driver.findElement(By.id("id_password"));
    protected static WebElement enter = Common.driver.findElement(By.cssSelector("[type=submit]"));

    @Step ("На странице входа вводим логин и пароль, и переходим на страницу 'Панель управления'")
    public static void enter () {
        login.sendKeys(Data.PageLogin.LOGIN);
        password.sendKeys(Data.PageLogin.PASSWORD);
        enter.click();
    }
}
