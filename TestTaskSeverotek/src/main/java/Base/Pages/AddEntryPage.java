package Base.Pages;

import Base.Common;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEntryPage {

    protected static WebElement formH1 = Common.driver.findElement(By.xpath("//div[@id='content']/h1"));
    protected static WebElement formTitle = Common.driver.findElement(By.id("id_title"));
    protected static WebElement formSlug = Common.driver.findElement(By.id("id_slug"));
    protected static WebElement formTextMarkdown = Common.driver.findElement(By.id("id_text_markdown"));
    protected static WebElement formText = Common.driver.findElement(By.id("id_text"));
    protected static WebElement formSave = Common.driver.findElement(By.cssSelector("[name='_save']"));

    public static String getFormH1() {
        return formH1.getText();
    }

    public static void setFormTitle () {
        formTitle.sendKeys(Data.formTitle);
    }

    public static void setFormSlug () {
        formSlug.sendKeys(Data.formSlug);
    }

    public static void setFormTextMarkdown () {
        formTextMarkdown.sendKeys(Data.formTextMarkdown);
    }

    public static void setFormText () {
        formText.sendKeys(Data.formText);
    }

    @Step ("Сохраняем введенные данные")
    public static void saveEntry () {
        formSave.click();
    }

    @Step ("Заполняем поля в разделе blog/entry/add/")
    public static void setFormAll () {
        setFormTitle();
        setFormSlug();
        setFormTextMarkdown();
        setFormText();
    }
}
