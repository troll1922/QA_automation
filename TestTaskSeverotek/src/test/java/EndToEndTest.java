import Base.*;
import Base.Pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndToEndTest {

    @BeforeClass
    public void setup () {
        Common.initDriver();
    }

    @Test
    public void endToEnd () throws InterruptedException {
        Common.driver.get(Data.Url.LOGIN_PAGE);
        LoginPage.enter();
        Assert.assertEquals(AdminPanelPage.getTextDashboardTitle(), Data.adminPaneldashboardTitle);
        AdminPanelPage.entryAdd();
        Assert.assertEquals(AddEntryPage.getFormH1(), Data.entryFormH1);
        AddEntryPage.setFormAll();
        AddEntryPage.saveEntry();
        //Common.driver.get(Data.Url.BLOG_PAGE);
        Thread.sleep(3000);
        //BlogPage.getFormTitle();
        //BlogPage.getFormTextMarkdown();
        //Assert.assertEquals(BlogPage.getFormTitle(), Data.formTitle);
        //Assert.assertEquals(BlogPage.getFormTextMarkdown(), Data.formTextMarkdown);
    }


    @Test
    public void test () throws InterruptedException {
        Common.driver.navigate().to(Data.Url.BLOG_PAGE);
        Thread.sleep(15000);
        Assert.assertEquals(BlogPage.getFormTitle(), Data.formTitle);
        Assert.assertEquals(BlogPage.getFormTextMarkdown(), Data.formTextMarkdown);
        Common.driver.navigate().back();
        EntriesPage.clickCheckBoxEntry();


        Thread.sleep(10000);

    }

    @AfterClass
    public void quit () {
        Common.quit();
    }
}
