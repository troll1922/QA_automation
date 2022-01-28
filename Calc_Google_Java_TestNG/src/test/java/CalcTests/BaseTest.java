package CalcTests;

import common.CommonActions;
import common.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseTest {
    protected static WebDriver driver = CommonActions.createDriver();

    protected static void openGoogleCalc (){
        driver.get(Constants.Urls.GOOGLE);
    }

    @Test
    public void Test () {
        Assert.assertEquals('1', "1");
    }
}
