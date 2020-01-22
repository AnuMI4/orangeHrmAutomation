package testClasses.adminModule.job;

import config.getConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjAndMethods.adminModule.jobObjAndMethods.jobTitlePageMethods;
import pageObjAndMethods.adminModule.userManagementObjAndMethods.userManagementElements;
import pageObjAndMethods.loginPage.loginMethods;
import setup.beforeAfterTestRun;
import java.util.Properties;

public class jobTitlesTestCases extends beforeAfterTestRun {

    Properties prop;
    userManagementElements ume;
    loginMethods lm;
    jobTitlePageMethods jtpm;

    public jobTitlesTestCases(){
        this.prop = getConfig.getProperty();
        this.ume = new userManagementElements();
    }

    @BeforeClass
    public void initjobTitlePageElementsAndMethods(){
        this.lm = new loginMethods(driver);
        lm.enterCredentials(prop.getProperty("username"), prop.getProperty("password"));
        this.jtpm = new jobTitlePageMethods(driver);
    }

    @Test(priority = 0)
    public void addJobTitle(){
        jtpm.addJobTitle();
        Assert.assertTrue(driver.findElement(ume.saveUserSuccessMsg).isDisplayed());
    }

    @Test(priority = 1)
    public void deleteJobTitle(){
        jtpm.deleteJobTitle();
        Assert.assertTrue(driver.findElement(ume.deletedRecordUserSuccessMsg).isDisplayed());
    }
}
