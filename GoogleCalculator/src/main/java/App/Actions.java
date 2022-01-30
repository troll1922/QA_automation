package App;

import Base.Common;
import org.openqa.selenium.By;

public class Actions extends ButtonsCalc {

    public static void openCalc () {
        Common.driver.get("https://www.google.ru/");
        Common.driver.findElement(By.name("q")).sendKeys("Калькулятор");
        Common.driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
    }

    public static void builderExpression (String exp) {

    }
}
