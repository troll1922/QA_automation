package AppCalc;

import Base.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ActionsCalc {

    public static void openCalc () {
        Common.driver.get("https://www.google.ru/");
        Common.driver.findElement(By.name("q")).sendKeys("Калькулятор");
        Common.driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
    }

    public static void builderExpression (String exp) {
        Map<String, WebElement> buttonsMap = ButtonsCalc.getButtonsMap();
        Set<String> keys = buttonsMap.keySet();
        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) != ' ') {
                for (String key : keys) {
                    if (key.equalsIgnoreCase(Character.toString(exp.charAt(i)))) {
                        buttonsMap.get(key).click();
                    }
                }
            }
        }
        ButtonsCalc.equals.click();
    }

    public static String getResult () {
        return ButtonsCalc.result.getText();
    }

    public static String getLineMemory () {
        return ButtonsCalc.lineMemory.getText();
    }
}
