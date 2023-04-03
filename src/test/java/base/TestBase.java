package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties prop;

    public static ChromeOptions options;




    public TestBase(){
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("D:\\Assignmnent2\\src\\main\\resources\\config.properties");
            prop.load(ip);
        } catch (IOException e){
            e.printStackTrace();
        }
    }



    public static void initialization(){
        String browserName = prop.getProperty("browser");
        System.setProperty("webdriver.chrome.driver", "D:\\Assignmnent2\\driver\\chromedriver.exe");
        //Chrome Options

        options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

    }


}

