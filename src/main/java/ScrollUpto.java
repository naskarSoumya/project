import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ScrollUpto {
    public static void main(String[] args){
        WebDriver driver= null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement scrollUpto = driver.findElement(By.xpath("//span[contains(text(),'Back')]"));

        js.executeScript("arguments[0].scrollIntoView();", scrollUpto);


    }
}
