package testClasses.adminModule;

import java.util.Properties;
import config.getConfig;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.adminModule.userManagementMethods;
import pages.loginPage.loginMethods;
import setup.beforeAfterTestRun;

public class userManagementTestCases extends beforeAfterTestRun {

    Properties prop;
    userManagementMethods umm;
    loginMethods lm;

    public userManagementTestCases(){
        this.prop = getConfig.getProperty();
    }

    @BeforeClass
    public void initLoginMethodsAndLoginAsAdmin(){
        this.lm = new loginMethods(driver);
        lm.enterCredentials(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test(priority = 0)
    public void searchByUsername(){
        this.umm = new userManagementMethods(driver);
        umm.userSearchByUsername();
    }

    @Test(enabled = false)
    public void searchByUserRole(){

    }

    @Test(priority = 1)
    public void searchByEmployeeName(){
        umm.userSearchByEmployeeName();
    }

    @Test(enabled = false)
    public void searchByStatus(){

    }

    @Test(priority = 2)
    public void addEmployee(){
        umm.userAdd();
    }

    @Test(priority = 3)
    public void deleteEmployee(){
        umm.userDelete();
    }

}
