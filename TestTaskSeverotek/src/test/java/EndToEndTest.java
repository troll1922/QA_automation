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
    public void dashboardTitle () {
        Common.driver.get(Data.Url.LOGIN_PAGE);
        LoginPage.enter();
        Assert.assertEquals(AdminPanelPage.getTextDashboardTitle(), Data.adminPaneldashboardTitle);
    }

    @Test (dependsOnMethods = "dashboardTitle")
    public void entryFormH1 () {
        AdminPanelPage.entryAdd();
        Assert.assertEquals(AddEntryPage.getFormH1(),Data.entryFormH1);
    }

    @Test (dependsOnMethods = "entryFormH1")
    public void formTitle () {
        AddEntryPage.setFormAll();
        AddEntryPage.saveEntry();
        Common.driver.navigate().to(Data.Url.BLOG_PAGE);
        Assert.assertEquals(BlogPage.getFormTitle(), Data.formTitle);
    }

    @Test (dependsOnMethods = "formTitle")
    public void blogTitle () {
        Assert.assertEquals(BlogPage.getFormTitle(), Data.formTitle);
        Assert.assertEquals(BlogPage.getFormTextMarkdown(), Data.formTextMarkdown);
        Common.driver.navigate().back();
        EntriesPage.deleteEntry();
    }

    @AfterClass
    public void tearDown () {
        Common.quit();
    }
}
