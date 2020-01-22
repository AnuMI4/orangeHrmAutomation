package pageObjAndMethods.adminModule.userManagementObjAndMethods;

import org.openqa.selenium.WebDriver;

import java.util.*;
import java.util.concurrent.TimeUnit;
import config.getConfig;
import pageObjAndMethods.general.generalMethods;

public class userManagementMethods {

    WebDriver driver;
    userManagementElements ume;
    Properties prop;
    generalMethods gm;
    public static String generatedNewUser;

    public userManagementMethods(WebDriver driver){
        this.driver = driver;
        this.ume = new userManagementElements();
        this.prop = getConfig.getProperty();
        this.gm = new generalMethods();
    }

    public void userSearchByUsername(){
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        driver.findElement(ume.btnReset).click();
        driver.findElement(ume.username).sendKeys(generatedNewUser);
        driver.findElement(ume.btnSearch).click();
    }

    public void userSearchByEmployeeName(){
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        driver.findElement(ume.btnReset).click();
        driver.findElement(ume.employeeName).sendKeys(prop.getProperty("employeeName"));
        driver.findElement(ume.btnSearch).click();
    }

    public void userSearchByRole() {
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        driver.findElement(ume.btnReset).click();
        driver.findElement(ume.userRole).sendKeys(prop.getProperty("userRole"));
        driver.findElement(ume.btnSearch).click();
    }

    public void userSearchByStatus() {
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        driver.findElement(ume.btnReset).click();
        driver.findElement(ume.userStatus).sendKeys(prop.getProperty("status"));
        driver.findElement(ume.btnSearch).click();
    }

    public void userAdd(){
        driver.get(prop.getProperty("addNewUserPage"));
        driver.findElement(ume.addNewEmployeeName).sendKeys(prop.getProperty("employeeName"));

        String randomGenerator = "1234567890";
        generatedNewUser = "user "+gm.generateString(new Random(), randomGenerator, 10);

        driver.findElement(ume.addNewUsername).sendKeys(generatedNewUser);
        driver.findElement(ume.addNewPassword).sendKeys(prop.getProperty("userPassword"));
        driver.findElement(ume.confirmNewPassword).sendKeys(prop.getProperty("userPassword"));
        driver.findElement(ume.btnSave).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    public void userDelete(){
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        this.ume = new userManagementElements();
        driver.findElement(ume.userCheckbox).click();
        driver.findElement(ume.btnDelete).click();
        driver.findElement(ume.deleteRecordModalBtnOk).click();
    }
}
