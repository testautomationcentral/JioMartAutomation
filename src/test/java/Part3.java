import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Part3 {
    public static void main(String[] args) throws InterruptedException {
        //TestAutomationCentral.com
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "C:\\temp\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jiomart.com/");

        List<WebElement> slides = driver.findElements(By.xpath("//*[contains(@class,'swiper-pagination-bullet')]/span"));

        for(WebElement e : slides){
            e.click();
            String slide = e.getAttribute("class");
            String label = e.getAttribute("aria-label");
            if(slide.contains("swiper-pagination-bullet-active")){
                System.out.println("Clicked on - " + label);
            }

            Thread.sleep(1000);
        }
    }
}
