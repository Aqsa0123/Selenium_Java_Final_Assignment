package tests;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class AboutPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;
    AboutPage aboutPage;
    public AboutPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        aboutPage = new AboutPage();
        homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
        aboutPage = homePage.VerifyOpenMenu();


    }

    @Test (priority = 1)
    public void VerifyClickOnAbout(){
        aboutPage = aboutPage.AboutOptionClick();

    }
    @Test (priority = 2)
    public void VerifyTitleOfAboutPage(){
        aboutPage = aboutPage.AboutOptionClick();
        String title = aboutPage.AboutPageTitle();
        Assert.assertEquals(title , "Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
    }

    @Test (priority = 3)
    public void VerifyTryItFreeButton(){
        aboutPage = aboutPage.AboutOptionClick();
        aboutPage.VerifyTryItFree();
        Assert.assertEquals(driver.getCurrentUrl(),"https://saucelabs.com/sign-up");
        System.out.println(driver.getCurrentUrl() + " is the enterprise URL");
        Assert.assertEquals(driver.getTitle(),prop.getProperty("Signup"));
    }
    @Test (priority = 4)
    public void VerifyScrollDownAboutPage(){
        aboutPage = aboutPage.AboutOptionClick();
        aboutPage.VerifyScrollDown();
    }

    @Test (priority = 5)
    public void VerifySearch(){
        aboutPage = aboutPage.AboutOptionClick();
        aboutPage.VerifySearchBar();
        //searchPage = aboutPage.VerifySearchBar("Testing");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
