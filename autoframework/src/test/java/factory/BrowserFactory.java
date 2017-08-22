package factory;

import dataProvider.ConfigDataProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by sukhjitparihar on 8/21/17.
 */
public class BrowserFactory {

    static WebDriver driver;

    public static WebDriver getBrowser(String browsername){

    if(browsername.equalsIgnoreCase("Chrome")){

        System.setProperty("webdriver.chrome.driver",DataProviderFactory.getConfig().getChromePath() );
        driver = new ChromeDriver();
    }
    else if(browsername.equalsIgnoreCase("firefox")){

        System.setProperty("webdriver.FireFox.driver",DataProviderFactory.getConfig().getChromePath() );
        driver = new FirefoxDriver();
    }
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
    return driver;


    }





}
