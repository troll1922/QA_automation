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

    public void builderExpression (String exp) {
        ButtonsCalc getButtons = new ButtonsCalc();
        Map<String, WebElement> buttonsMap = getButtons.getButtonsMap();
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
        getButtons.equals.click();
    }

    public static String getResult () {
        return new ButtonsCalc().result.getText();
    }

    public static String getLineMemory () {
        return new ButtonsCalc().lineMemory.getText();
    }
}
