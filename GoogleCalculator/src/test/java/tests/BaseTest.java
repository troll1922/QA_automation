package tests;

import AppCalc.ActionsCalc;
import Base.Common;
import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest {

    @BeforeMethod
    public void setup () {
        Common.initDriver();
        ActionsCalc.openCalc();
    }

    @Test (description = "Проверка операций с целыми числами")
    public void intExpression () {
        new ActionsCalc().builderExpression(DataExpression.intExpression.intExp);
        Assert.assertTrue(ActionsCalc.getLineMemory().contains(DataExpression.intExpression.intExp));
        Assert.assertEquals(ActionsCalc.getResult(), DataExpression.intExpression.resultIntExp);
    }

    @Test (description = "Проверка деления на ноль", dependsOnMethods = "intExpression")
    public void divideOnZero () {
        new ActionsCalc().builderExpression(DataExpression.divideOnZero.zeroExp);
        Assert.assertTrue(ActionsCalc.getLineMemory().contains(DataExpression.divideOnZero.zeroExp));
        Assert.assertEquals(ActionsCalc.getResult(), DataExpression.divideOnZero.resultZeroExp);
    }

    @Test (description = "Проверка ошибки при отсутствии значения", dependsOnMethods = "divideOnZero")
    public void sinVoidError () {
        new ActionsCalc().builderExpression(DataExpression.sinVoidError.sinExp);
        Assert.assertTrue(ActionsCalc.getLineMemory().contains(DataExpression.sinVoidError.lineMemorySin));
        Assert.assertEquals(ActionsCalc.getResult(), DataExpression.sinVoidError.resultSinVoidError);
    }

    @AfterMethod
    public void tearDown () {
        Common.quit();
    }
}
