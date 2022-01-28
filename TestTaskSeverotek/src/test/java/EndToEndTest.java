import Pages.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
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

        Thread.sleep(3000);
    }

    @AfterClass
    public void quit () {
        Common.quit();
    }
}
