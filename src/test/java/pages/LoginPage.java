package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    //Page Factory - OR:
    @FindBy(name="user-name")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(name="login-button")
    WebElement loginBtn;

    @FindBy(xpath="//button[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath="//*[@id=\"root\"]/div/div[1]")
    WebElement Logo;


    // Initialization of Page Objects
    public LoginPage(){
        PageFactory.initElements(driver, this); //this points to the current page

    }

    //Actions ( Method to Validate Login Page Title)
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }
    public boolean validateCRMImage(){
        return Logo.isDisplayed(); //As it return "True or False" so we change void to boolean.
    }
    public HomePage login(String un, String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click(); //Its moving to homepage now.

        return new HomePage();
    }

}
