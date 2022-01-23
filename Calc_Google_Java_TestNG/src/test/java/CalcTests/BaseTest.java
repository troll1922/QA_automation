package CalcTests;

import common.CommonActions;
import common.Constants;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    protected static WebDriver driver = CommonActions.createDriver();

    protected static void openGoogleCalc (){
        driver.get(Constants.Urls.GOOGLE);
    }
}
