package App;

import Base.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ButtonsCalc {
       // 0
       protected static WebElement zero = Common.driver.findElement(By.cssSelector("[jsname='bkEvMb']"));
       // 1
       protected static WebElement one = Common.driver.findElement(By.cssSelector("[jsname='N10B9']"));
       // 2
       protected static WebElement two = Common.driver.findElement(By.cssSelector("[jsname='lVjWed']"));
       // 3
       protected static WebElement three = Common.driver.findElement(By.cssSelector("[jsname='KN1kY']"));
       // 4
       protected static WebElement four = Common.driver.findElement(By.cssSelector("[jsname='xAP7E']"));
       // 5
       protected static WebElement five = Common.driver.findElement(By.cssSelector("[jsname='Ax5wH']"));
       // левая скобка
       protected static WebElement leftBracket = Common.driver.findElement(By.cssSelector("[jsname='j93WEe']"));
       // правая скобка
       protected static WebElement rightBracket = Common.driver.findElement(By.cssSelector("[jsname='qCp9A']"));
       // +
       protected static WebElement plus = Common.driver.findElement(By.cssSelector("[jsname='XSr6wc']"));
       // -
       protected static WebElement minus = Common.driver.findElement(By.cssSelector("[jsname='pPHzQc']"));
       // *
       protected static WebElement * = Common.driver.findElement(By.cssSelector("[jsname='YovRWb']"));
       // делить
       protected static WebElement divide = Common.driver.findElement(By.cssSelector("[jsname='WxTTNd']"));
       // =
       protected static WebElement choose = Common. driver.findElement(By.cssSelector("[jsname='Pt8tGc']"));
}
