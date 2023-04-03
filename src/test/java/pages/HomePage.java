package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    //Page Factory
    @FindBy(xpath = "//*[@id=\"logout_sidebar_link\"]")
    WebElement Logout;

    //Button Add to Cart
    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCart;

    //Remove Button
    @FindBy(name = "remove-sauce-labs-backpack")
    WebElement Remove;

    //Open Menu
    @FindBy(xpath ="//*[@id=\"react-burger-menu-btn\"]")
    WebElement OpenMenu;

    // Initializing the Page Objects:
    public HomePage(){
        PageFactory.initElements(driver, this); //this points to the current page

    }



    //Add Method
    public void VerifyItemAddedToCart(){
        AddToCart.click();
    }
    //Remove method
    public void VerifyItemRemovedFromCart() {
        Remove.click();
    }

    public AboutPage VerifyOpenMenu(){
        //OpenMenu.click();
        OpenMenu.click();
        return new AboutPage();
    }

    public LoginPage VerifyUserLoggingOut(){
        Logout.click();
        return new LoginPage();
    }

}



