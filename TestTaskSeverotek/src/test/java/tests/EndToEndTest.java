package tests;

import Base.*;
import Base.Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.*;

public class EndToEndTest {

    @BeforeTest
    public void setup () {
        Common.initDriver();
    }

    @Test (description = "Проверка заголовка 'Панель упарвления'")
    @Description ("Проверяем, что на странице 'Панель упарвления' присутствует заголовок - 'Панель управления'")
    @Owner(value = "Фомичёв Алексей Викторович")
    public void dashboardTitle () {
        Common.driver.get(Data.Url.LOGIN_PAGE);
        LoginPage.enter();
        Assert.assertEquals(AdminPanelPage.getTextDashboardTitle(), Data.adminPaneldashboardTitle);
    }

    @Test (description = "Проверка заголовка 'Добавить entry'", dependsOnMethods = "dashboardTitle")
    @Description ("Проверяем, что на странице 'Добавить entry' присутствует заголовок - 'Добавить entry'")
    @Owner(value = "Фомичёв Алексей Викторович")
    public void entryFormH1 () {
        AdminPanelPage.entryAdd();
        Assert.assertEquals(AddEntryPage.getFormH1(),Data.entryFormH1);
    }

    @Test (description = "Cоздание и удаление записи в блоге", dependsOnMethods = "entryFormH1")
    @Description ("Проверяем, что созданная запись в блоге отображается на сайте и удаляем ее")
    @Owner(value = "Фомичёв Алексей Викторович")
    public void addNoteInBlog () {
        AddEntryPage.setFormAll();
        AddEntryPage.saveEntry();
        Common.driver.navigate().to(Data.Url.BLOG_PAGE);
        Assert.assertEquals(BlogPage.getFormTitle(), Data.formTitle);
        Assert.assertEquals(BlogPage.getFormTextMarkdown(), Data.formTextMarkdown);
    }

    @Test (description = "Проверка удаления записи в блоге", dependsOnMethods = "addNoteInBlog")
    @Description ("Проверяем, что запись в блоге удалена")
    @Owner(value = "Фомичёв Алексей Викторович")
    public void blogTitle () {
        Common.driver.navigate().back();
        EntriesPage.deleteEntry();
        Assert.assertTrue(EntriesPage.isLinkEntry());

    }

    @AfterTest (alwaysRun = true)
    public void tearDown () {
        Common.quit();
    }
}
