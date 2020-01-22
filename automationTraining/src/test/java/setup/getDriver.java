package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.Properties;
import config.getConfig;

public class getDriver {

    WebDriver driver;
    Properties prop;

    public getDriver(){
        this.prop = getConfig.getProperty();
    }

    public WebDriver retDriver(){

        if(prop.getProperty("browser").equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/home/anummirza/Desktop/chromedriver");
            driver = new ChromeDriver();
        }

        if(prop.getProperty("browser").equals("firefox")){
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")  + File.separator + "geckodriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        return driver;
    }
}
