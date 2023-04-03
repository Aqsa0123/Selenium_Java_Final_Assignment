package connectionString;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriverWait wait;
    public static WebDriver driver;
    @Test
    public void googleSearch() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "D:\\Testproject\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        // driver.get("https://10pearlsuniversity.org");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(),"Google");
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Thread.sleep(50000);
    }
    // @AfterMethod
            //  public void tearDown() {

        //driver.quit();
   // }

    public static WebDriverWait setExplicitWait(int secs){
        wait = new WebDriverWait(driver, Duration.ofSeconds(secs));
        return wait;
    }
}
