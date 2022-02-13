import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RgistrationForm {
    public static void main(String[] args){

        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
        firstname.sendKeys("Soumya");

        WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
        lastname.sendKeys("Naskar");

        WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
        phone.sendKeys("8334857269");

        WebElement address = driver.findElement(By.xpath("//input[@name=\"address1\"]"));
        address.sendKeys("Tara Appartment");

        WebElement city = driver.findElement(By.xpath("//input[@name=\"city\"]"));
        city.sendKeys("Howrah");








    }
}
