import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {


        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       // driver.get("https://demo.guru99.com/test/radio.html");

       // WebElement radio2ndButton = driver.findElement(By.xpath("//input[@id=\"vfb-7-2\"]"));
       // radio2ndButton.click();

        driver.get("https://www.amazon.in/");
        WebElement search = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
        search.sendKeys("Mobile");

    }
}
