package AppCalc;

import Base.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class ButtonsCalc {
       // 0
       public static WebElement zero = Common.driver.findElement(By.cssSelector("[jsname='bkEvMb']"));
       // 1
       public static WebElement one = Common.driver.findElement(By.cssSelector("[jsname='N10B9']"));
       // 2
       public static WebElement two = Common.driver.findElement(By.cssSelector("[jsname='lVjWed']"));
       // 3
       public static WebElement three = Common.driver.findElement(By.cssSelector("[jsname='KN1kY']"));
       // 4
       public static WebElement four = Common.driver.findElement(By.cssSelector("[jsname='xAP7E']"));
       // 5
       public static WebElement five = Common.driver.findElement(By.cssSelector("[jsname='Ax5wH']"));
       // 6
       public static WebElement six = Common.driver.findElement(By.cssSelector("[jsname='abcgof']"));
       // левая скобка
       public static WebElement leftBracket = Common.driver.findElement(By.cssSelector("[jsname='j93WEe']"));
       // правая скобка
       public static WebElement rightBracket = Common.driver.findElement(By.cssSelector("[jsname='qCp9A']"));
       // +
       public static WebElement plus = Common.driver.findElement(By.cssSelector("[jsname='XSr6wc']"));
       // -
       public static WebElement minus = Common.driver.findElement(By.cssSelector("[jsname='pPHzQc']"));
       // ×
       public static WebElement multiply = Common.driver.findElement(By.cssSelector("[jsname='YovRWb']"));
       // ÷
       public static WebElement divide = Common.driver.findElement(By.cssSelector("[jsname='WxTTNd']"));
       // =
       public static WebElement equals = Common.driver.findElement(By.cssSelector("[jsname='Pt8tGc']"));
       // результат
       public static WebElement result = Common.driver.findElement(By.cssSelector("[jsname='VssY5c']"));
       // строка памяти
       public static WebElement lineMemory = Common.driver.findElement(By.cssSelector("[jsname='ubtiRe']"));

       public static Map <String, WebElement> buttonsMap = new HashMap<>();

       public static Map <String, WebElement> getButtonsMap () {
              //Map <String, WebElement> buttonsMap = new HashMap<>();
              buttonsMap.put("0", zero);
              buttonsMap.put("1", one);
              buttonsMap.put("2", two);
              buttonsMap.put("3", three);
              buttonsMap.put("4", four);
              buttonsMap.put("5", five);
              buttonsMap.put("6", six);
              buttonsMap.put("(", leftBracket);
              buttonsMap.put(")", rightBracket);
              buttonsMap.put("+", plus);
              buttonsMap.put("-", minus);
              buttonsMap.put("×", multiply);
              buttonsMap.put("÷", divide);
              return buttonsMap;
       }
}
