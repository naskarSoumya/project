import io.github.bonigarcia.wdm.WebDriverManager;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {


        WebDriver driver = null;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        List<WebElement> checkboxButtonList = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (int i =0; i<checkboxButtonList.size();i++){
            System.out.println("================ "+checkboxButtonList.get(i).getAttribute("value"));





        }
        System.out.println("Count of checkbox Buttons  " + checkboxButtonList.size());


        //WebElement radio2ndButton = driver.findElement(By.cssSelector("input#vfb-7-2"));
        //radio2ndButton.click();

        //WebElement radio1stButton = driver.findElement(By.xpath("input#vfb-7-1"));
        //radio1stButton.click();

        //WebElement radio3rdButton = driver.findElement(By.xpath("input#vfb-7-3"));
        //radio3rdButton.click();

        //driver.get("https://www.amazon.in/");
        //WebElement search = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        //search.sendKeys("Mobile");

        //WebElement search1 = driver.findElement(By.cssSelector("input#nav-search-submit-button"));
        //search1.click();

        //List<WebElement> mobileList = driver.findElements(By.xpath("//span[@class ='a-size-medium a-color-base a-text-normal']\n"));
        //for (int i =0; i<mobileList.size();i++){
            //System.out.println("================ "+mobileList.get(i).getText());

        //}
        //System.out.println("Count of mobiles  " + mobileList.size());





    }
}
