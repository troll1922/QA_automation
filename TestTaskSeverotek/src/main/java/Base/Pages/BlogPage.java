package Base.Pages;

import Base.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BlogPage {

    protected static WebElement formTitle = Common.driver.findElement(By.xpath("(//a[@class='entry_title'])[1]"));
    protected static WebElement formTextMarkdown = Common.driver.findElement(By.xpath("(//div[@class='entry']/p)[1]"));

    public static String getFormTitle () {
        return formTitle.getText();
    }

    public static String getFormTextMarkdown () {
        return formTextMarkdown.getText();
    }

}
