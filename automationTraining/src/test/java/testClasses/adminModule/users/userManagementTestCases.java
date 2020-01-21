package testClasses.adminModule.users;

import java.util.Properties;
import config.getConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjAndMethods.adminModule.userManagementMethods;
import pageObjAndMethods.adminModule.userManagementElements;
import pageObjAndMethods.loginPage.loginMethods;
import setup.beforeAfterTestRun;

public class userManagementTestCases extends beforeAfterTestRun {

    Properties prop;
    userManagementMethods umm;
    userManagementElements ume;
    loginMethods lm;

    public userManagementTestCases(){
        this.prop = getConfig.getProperty();
        this.ume = new userManagementElements();
    }

    @BeforeClass
    public void initLoginAndUserMethodsAndLoginAsAdmin(){
        this.lm = new loginMethods(driver);
        lm.enterCredentials(prop.getProperty("username"), prop.getProperty("password"));
        this.umm = new userManagementMethods(driver);
    }

    @Test(enabled = false)
    public void searchByUsername(){
        umm.userSearchByUsername();
    }

    @Test(enabled = false)
    public void searchByUserRole(){

    }

    @Test(enabled = false)
    public void searchByEmployeeName(){
        umm.userSearchByEmployeeName();
    }

    @Test(enabled = false)
    public void searchByStatus(){

    }

    @Test(enabled = false)
    public void addEmployee(){
        umm.userAdd();
        Assert.assertTrue(driver.findElement(ume.saveUserSuccessMsg).isDisplayed());
    }

    @Test(priority = 0)
    public void deleteEmployee(){
        umm.userDelete();
    }

}
