package tests;

import connectionString.BaseClass;
import objects.SaucelabLoginPage;
import objects.SauceLabHomePage;
import org.testng.annotations.Test;

public class SauceLabTests extends BaseClass {
    SaucelabLoginPage saucelabLoginPage = new SaucelabLoginPage();
    SauceLabHomePage sauceLabHomePage = new SauceLabHomePage();

    @Test
    public void login_page() {
        saucelabLoginPage.HomePage();
        saucelabLoginPage.enterLoginDetails("standard_user", "secret_sauce");
        saucelabLoginPage.clickLoginBtn();


    }


}
