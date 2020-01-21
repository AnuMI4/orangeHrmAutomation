package pageObjAndMethods.loginPage;

import config.getConfig;
import org.openqa.selenium.WebDriver;
import java.util.Properties;

public class loginMethods {

    WebDriver driver;
    loginElements le;
    Properties prop;

    public loginMethods(WebDriver driver){
        this.driver = driver;
        this.le = new loginElements();
        this.prop = getConfig.getProperty();
    }

    public void enterCredentials(String username, String password){
        driver.get(prop.getProperty("loginPage"));
        driver.findElement(le.userName).sendKeys(username);
        driver.findElement(le.password).sendKeys(password);
        driver.findElement(le.btnLogin).click();
    }
}
