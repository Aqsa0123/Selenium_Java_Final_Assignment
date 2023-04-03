package connectionString;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class secondquestion {
    public WebDriver driver;
    @Test
    public void googleSearch() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "D:\\Testproject\\drivers\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
       // driver.get("https://10pearlsuniversity.org");
        driver.get("https://10pearlsuniversity.org/user-account");
        Thread.sleep(50000);
       // driver.findElement(By.cssSelector("#header > div.header_default.header_5.fixed > div > div > div.col-md-9.col-sm-9.col-sm-offset-0.hidden-xs.hidden-sm > div.header_main_menu_wrapper.clearfix > div.pull-right.hidden-xs.right_buttons > a")).click();
       // Thread.sleep(50000);
        driver.findElement(By.cssSelector("#stm-lms-login > div.account-form.test > div:nth-child(1) > input")).sendKeys("aqsa.zahoor@10pearls.com");
        driver.findElement(By.cssSelector("#stm-lms-login > div.account-form.test > div:nth-child(2) > input")).sendKeys("Aqsa94640137");
        Thread.sleep(50000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/div/div/div[1]/div/div[2]/div/div[2]/div[4]/a")).click();
        Thread.sleep(50000);
        String username= String.valueOf(driver.findElement(By.cssSelector("#main > div.container > div.post_type_exist.clearfix > div > div > div > div:nth-child(2) > div.stm_lms_private_information > div")));
        Assert.assertEquals(username,"Aqsa Zahoor");
        System.out.println("My name is   " + username);
        driver.close();



    }}
