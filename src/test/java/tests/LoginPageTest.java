package tests;
import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase {
    LoginPage loginPage;
    HomePage homePage;

    public LoginPageTest() {
        super();
    }


    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage  = new LoginPage();

    }
    @Test (priority=1)
    public void loginPageTitleTest(){
        String title = loginPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Swag Labs");
    }

    @Test (priority=2)
    public void crmLogoImageTest(){
        boolean flag = loginPage.validateCRMImage();
        Assert.assertTrue(flag);
    }

    @Test(priority = 3)
    public void LoginTest(){
        homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
