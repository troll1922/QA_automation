package CalcTests;

import common.Constants;
import org.testng.annotations.Test;
import pages.calculator.OpenCalc;

public class IntMathTest {

    @Test
    public void checkIntMath () {
        OpenCalc.open(Constants.Urls.GOOGLE);

    }
}
