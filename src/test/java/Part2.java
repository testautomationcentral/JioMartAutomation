import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Part2 {
    public static void main(String[] args) {
        //TestAutomationCentral.com
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\temp\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jiomart.com/");

        WebElement groceries = driver.findElement(By.xpath("//*[@id='nav_link_2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(groceries).build().perform();

        List<WebElement> submenu = driver.findElements(By.xpath("//*[@id='nav_cat_2']/div/ul/li/a"));

        for(WebElement e: submenu){
            actions.moveToElement(e).build().perform();
            System.out.println(e.getText());
        }


    }
}
