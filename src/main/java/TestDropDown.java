import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDropDown {
    public static void main(String[] args){


        WebDriver driver= null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        String baseUrl = "https://demo.guru99.com/test/newtours/register.php";
        driver.get(baseUrl);

        Select country = new Select(driver.findElement(By.name("country")));
        //country.selectByVisibleText("AUSTRIA");
        //country.selectByIndex(2);
        country.selectByValue("INDIA");

    }
}
