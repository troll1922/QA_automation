package pages.calculator;

import common.CommonActions;
import org.openqa.selenium.WebDriver;

public class OpenCalc {

    static WebDriver driver = CommonActions.createDriver();

    public static void open (String Url) {
        driver.get(Url);
        //открыть калькулятор
    }

}
