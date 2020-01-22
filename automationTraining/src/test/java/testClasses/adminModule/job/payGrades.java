package testClasses.adminModule.job;

import config.getConfig;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjAndMethods.adminModule.jobObjAndMethods.payGradesPageMethods;
import pageObjAndMethods.adminModule.userManagementObjAndMethods.userManagementElements;
import pageObjAndMethods.loginPage.loginMethods;
import setup.beforeAfterTestRun;
import java.util.Properties;

public class payGrades extends beforeAfterTestRun {

    Properties prop;
    payGradesPageMethods pgpm;
    loginMethods lm;
    userManagementElements ume;

    public payGrades(){
        this.prop = getConfig.getProperty();
        this.ume = new userManagementElements();
    }

    @BeforeClass
    public void initPayGrades(){
        this.lm = new loginMethods(driver);
        lm.enterCredentials(prop.getProperty("username"), prop.getProperty("password"));
        this.pgpm = new payGradesPageMethods(driver);
    }

    @Test(priority = 0)
    public void addJobPayGrade(){
        pgpm.addPayGrade();
        Assert.assertTrue(driver.findElement(ume.saveUserSuccessMsg).isDisplayed());
    }

    @Test(priority = 1)
    public void deletePayGrade(){
        pgpm.deletePayGrade();
        Assert.assertTrue(driver.findElement(ume.deletedRecordUserSuccessMsg).isDisplayed());
    }
}
