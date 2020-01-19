package testClasses.login;

import config.getConfig;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.loginPage.loginMethods;
import java.util.Properties;
import setup.beforeAfterTestRun;

public class loginTestCases extends beforeAfterTestRun {

    loginMethods lm;
    Properties prop;

    public loginTestCases(){
        this.prop = getConfig.getProperty();
    }

    @BeforeClass
    public void initLoginMethods(){
        this.lm = new loginMethods(super.driver);
    }

    @Test(priority = 0)
    public void enterCorrectCredentials(){
        lm.enterCredentials(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void enterCorrectUserAndIncorrectPassword(){
        lm.enterCredentials(prop.getProperty("username"), "IncorrectPassword");
    }

    @Test(priority = 2)
    public void enterIncorrectUserAndCorrectPassword(){
        lm.enterCredentials("IncorrectUsername", prop.getProperty("password"));
    }

    @Test(priority = 3)
    public void enterIncorrectCredentials(){
        lm.enterCredentials("IncorrectUsername", "IncorrectPassword");
    }

}
