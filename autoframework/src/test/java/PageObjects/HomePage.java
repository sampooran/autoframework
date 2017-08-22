package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sukhjitparihar on 8/21/17.
 */
public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver ldriver){
        this.driver =ldriver;

    }
    @FindBy(xpath = "//a[text()='Sign In']") WebElement SignInLink;
    @FindBy(xpath = "//a[text()='My Account']") WebElement MyAccountLink;
    @FindBy(xpath = "//a[text=('My cart')]") WebElement MyCartLink;
    @FindBy(xpath = "//a[text=('Checkout')]") WebElement CheckoutLink;


    public void clickOnSignInLink(){
        SignInLink.click();
    }

    public void clickOnMyAccountLink(){
        MyAccountLink.click();
    }

    public void clickOnMyCartLink(){
        MyCartLink.click();
    }

    public void clickOnCheckoutLink(){
        CheckoutLink.click();
    }

    public String getApplicationTitle(){
        return driver.getTitle();

    }
}
