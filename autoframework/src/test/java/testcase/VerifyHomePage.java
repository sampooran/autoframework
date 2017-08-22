package testcase;

import PageObjects.HomePage;
import factory.BrowserFactory;
import factory.DataProviderFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by sukhjitparihar on 8/21/17.
 */
public class VerifyHomePage {

    @Test
    public void testHomePage(){

       WebDriver driver =  BrowserFactory.getBrowser("ChromeDriver");
        driver.get(DataProviderFactory.getConfig().getApplicationURL());

        HomePage home = PageFactory.initElements(driver, HomePage.class);

        String title = home.getApplicationTitle();
        System.out.println("My Application Title is" + title);

    }
}
