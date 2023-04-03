package tests;

import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends TestBase {

    LoginPage loginPage;
    HomePage homePage;
    AboutPage aboutPage;


    public HomePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @Test (priority = 1)
    public void verifyItemAdded() {
        homePage.VerifyItemAddedToCart();

    }
    @Test (priority = 2)
    public void verifyItemRemoved(){
        homePage.VerifyItemAddedToCart();
        homePage.VerifyItemRemovedFromCart();
    }

    @Test (priority = 3)
    public void verifySidePane(){
        aboutPage = homePage.VerifyOpenMenu();
    }
    @Test (priority = 4)
    public void verifyLogout(){
        aboutPage = homePage.VerifyOpenMenu();
        loginPage = homePage.VerifyUserLoggingOut();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

