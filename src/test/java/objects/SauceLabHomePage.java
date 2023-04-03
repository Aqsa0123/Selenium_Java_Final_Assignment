package objects;
import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SauceLabHomePage extends BaseClass {
    protected By backPackElm = By.xpath("//div[text()='Sauce Labs Backpack']");
    protected By addToCartElm = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    public String getItemName() {
        WebElement backPackLink = setExplicitWait(30).until(ExpectedConditions.visibilityOfElementLocated(backPackElm));
        return backPackLink.getText();
    }

    public void clickAddToCart() {
        WebElement addToCartBtn = setExplicitWait(30).until(ExpectedConditions.visibilityOfElementLocated(addToCartElm));
        addToCartBtn.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }}