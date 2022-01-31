package tests;

import AppCalc.ActionsCalc;
import Base.Common;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeClass
    public void setup () {
        Common.initDriver();
        //ActionsCalc.openCalc();
    }

    @Test (description = "Проверка операций с целыми числами")
    public void intExpression () {
        ActionsCalc.openCalc();
        ActionsCalc.builderExpression(DataExpression.intExpression.intExp);
        Assert.assertTrue(ActionsCalc.getLineMemory().contains(DataExpression.intExpression.intExp));
        Assert.assertEquals(ActionsCalc.getResult(), DataExpression.intExpression.resultIntExp);
        Common.driver.quit();
    }

    @Test (description = "Проверка деления на ноль", dependsOnMethods = "intExpression")
    public void DivideOnZero () {
        Common.initDriver();
        ActionsCalc.openCalc();
        ActionsCalc.builderExpression(DataExpression.divideOnZero.zeroExp);
        Assert.assertTrue(ActionsCalc.getLineMemory().contains(DataExpression.divideOnZero.zeroExp));
        Assert.assertEquals(ActionsCalc.getResult(), DataExpression.divideOnZero.resultZeroExp);
    }

    @AfterClass
    public void tearDown () {
        Common.quit();
    }
}
