package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AboutPage extends TestBase {

    @FindBy(xpath = "//*[@id=\"about_sidebar_link\"]")
    WebElement AboutTitle;

    @FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[2]/a/button[2]")
    WebElement RequestDemo;

    @FindBy(xpath="//*[@id=\"__next\"]/header/div/div/div[2]/div/button/div/span/img")
    WebElement SearchBarIcon;

    @FindBy(xpath = "/html/body/div[12]/div[3]/div/div/div/div[1]/div/div")
    WebElement SearchBar;

    @FindBy(xpath = "//*[@id=\"__next\"]/div[2]/div[1]/div/div[2]/span/img")
    WebElement ScrollDown;

    @FindBy(xpath = "//*[@id=\"__next\"]/header/div/div/div[2]/div/div[3]/a/button")
    WebElement TryItFree;

    // Initialization of Page Objects
    public AboutPage(){
        PageFactory.initElements(driver, this); //this points to the current page

    }

    //Actions ( Method to Validate Login Page Title)
    public AboutPage AboutOptionClick(){
        AboutTitle.click();
        return new AboutPage();
    }

    public String AboutPageTitle(){
        return driver.getTitle();}

    public void VerifyScrollDown(){
        ScrollDown.click();
    }

    public void VerifySearchBar(){
        SearchBarIcon.click();
      //  SearchBar.sendKeys(kwd);
      //  return new SearchPage();
    }
    public void VerifyTryItFree(){
        TryItFree.click();
      //  driver.getCurrentUrl();
    }


}


