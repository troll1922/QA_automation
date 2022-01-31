package AppCalc;

import Base.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class ButtonsCalc {
       // 0
       private final WebElement zero = Common.driver.findElement(By.cssSelector("[jsname='bkEvMb']"));
       // 1
       private final WebElement one = Common.driver.findElement(By.cssSelector("[jsname='N10B9']"));
       // 2
       private final WebElement two = Common.driver.findElement(By.cssSelector("[jsname='lVjWed']"));
       // 3
       private final WebElement three = Common.driver.findElement(By.cssSelector("[jsname='KN1kY']"));
       // 4
       private final WebElement four = Common.driver.findElement(By.cssSelector("[jsname='xAP7E']"));
       // 5
       private final WebElement five = Common.driver.findElement(By.cssSelector("[jsname='Ax5wH']"));
       // 6
       private final WebElement six = Common.driver.findElement(By.cssSelector("[jsname='abcgof']"));
       // левая скобка
       private final WebElement leftBracket = Common.driver.findElement(By.cssSelector("[jsname='j93WEe']"));
       // правая скобка
       private final WebElement rightBracket = Common.driver.findElement(By.cssSelector("[jsname='qCp9A']"));
       // +
       private final WebElement plus = Common.driver.findElement(By.cssSelector("[jsname='XSr6wc']"));
       // -
       private final WebElement minus = Common.driver.findElement(By.cssSelector("[jsname='pPHzQc']"));
       // ×
       private final WebElement multiply = Common.driver.findElement(By.cssSelector("[jsname='YovRWb']"));
       // ÷
       private final WebElement divide = Common.driver.findElement(By.cssSelector("[jsname='WxTTNd']"));
       // sin
       private final WebElement sin = Common.driver.findElement(By.cssSelector("[jsname='aN1RFf']"));
       // =
       public final WebElement equals = Common.driver.findElement(By.cssSelector("[jsname='Pt8tGc']"));
       // результат
       public final WebElement result = Common.driver.findElement(By.cssSelector("[jsname='VssY5c']"));
       // строка памяти
       public final WebElement lineMemory = Common.driver.findElement(By.cssSelector("[jsname='ubtiRe']"));

       public final Map <String, WebElement> buttonsMap = new HashMap<>();

       public Map <String, WebElement> getButtonsMap () {
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
              buttonsMap.put("s", sin);
              return buttonsMap;
       }
}
