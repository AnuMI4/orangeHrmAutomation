package testClasses.adminModule.users;

import java.util.List;
import java.util.Properties;
import config.getConfig;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjAndMethods.adminModule.userManagementObjAndMethods.userManagementMethods;
import pageObjAndMethods.adminModule.userManagementObjAndMethods.userManagementElements;
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

    @Test(priority = 1)
    public void searchByUsername(){
        umm.userSearchByUsername();
        List<WebElement> rows = driver.findElement(ume.usersTable).findElements(ume.row);
        System.out.println(rows.size());

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(ume.column);
//            for (WebElement col : cols) {
//                System.out.print(col.getText());
//            }
            System.out.println(cols.get(1).getText());
            Assert.assertEquals(cols.get(1).getText(), userManagementMethods.generatedNewUser);
        }
    }

    @Test(priority = 2)
    public void searchByUserRole(){
        umm.userSearchByRole();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> rows = driver.findElement(ume.usersTable).findElements(ume.row);
        System.out.println(rows.size());

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(ume.column);
//            for (WebElement col : cols) {
//                System.out.print(col.getText());
//            }
            System.out.println(cols.get(2).getText());
            Assert.assertEquals(cols.get(2).getText(), prop.getProperty("userRole"));
        }
    }

    @Test(priority = 3)
    public void searchByEmployeeName(){
        umm.userSearchByEmployeeName();
        List<WebElement> rows = driver.findElement(ume.usersTable).findElements(ume.row);

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(ume.column);
//            for (WebElement col : cols) {
//                System.out.print(col.getText());
//            }
            System.out.println(cols.get(3).getText());
            Assert.assertEquals(cols.get(3).getText(), prop.getProperty("employeeName"));
        }
    }

    @Test(priority = 4)
    public void searchByStatus(){
        umm.userSearchByStatus();
        List<WebElement> rows = driver.findElement(ume.usersTable).findElements(ume.row);

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(ume.column);
//            for (WebElement col : cols) {
//                System.out.print(col.getText());
//            }
            System.out.println(cols.get(4).getText());
            Assert.assertEquals(cols.get(4).getText(), prop.getProperty("status"));
        }
    }

    @Test(priority = 0)
    public void addEmployee(){
        umm.userAdd();
        Assert.assertTrue(driver.findElement(ume.saveUserSuccessMsg).isDisplayed());
    }

    @Test(priority = 5)
    public void deleteEmployee(){
        umm.userDelete();
        Assert.assertTrue(driver.findElement(ume.deletedRecordUserSuccessMsg).isDisplayed());
    }

}
