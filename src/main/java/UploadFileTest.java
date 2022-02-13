import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UploadFileTest {
    public static void main(String[] args) {
        WebDriver driver= null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.guru99.com/test/upload/");

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"uploadfile_0\"]")));

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id=\"uploadfile_0\"]"));
        chooseFile.sendKeys("D:\\IMPORTANT\\ss.png");

        WebElement termsButton = driver.findElement(By.xpath("//input[@id=\"terms\"]"));
        termsButton.click();

        WebElement submitButton = driver.findElement(By.xpath("//button[@id=\"submitbutton\"]"));
        submitButton.click();

        System.out.println("One file has been submitted");







    }
}
