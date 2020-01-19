package pages.adminModule;

import org.openqa.selenium.WebDriver;
import java.util.Properties;
import config.getConfig;

public class userManagementMethods {

    WebDriver driver;
    userManagementElements ume;
    Properties prop;

    public userManagementMethods(WebDriver driver){
        this.driver = driver;
        this.ume = new userManagementElements();
        this.prop = getConfig.getProperty();
    }

    public void userSearchByUsername(){
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        driver.findElement(ume.btnReset).click();
        driver.findElement(ume.username).sendKeys(prop.getProperty("usernameFiona"));
        driver.findElement(ume.btnSearch).click();
    }

    public void userSearchByEmployeeName(){
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        driver.findElement(ume.btnReset).click();
        driver.findElement(ume.employeeName).sendKeys(prop.getProperty("employeeNameFiona"));
        driver.findElement(ume.btnSearch).click();
    }

    public void userAdd(){
        driver.get(prop.getProperty("addNewUserPage"));
        driver.findElement(ume.addNewEmployeeName).sendKeys(prop.getProperty("employeeNameFiona"));
        driver.findElement(ume.addNewUsername).sendKeys(prop.getProperty("usernameFiona2"));
        driver.findElement(ume.btnSave).click();
    }

    public void userDelete(){
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        //driver.findElement(ume.userFionaCheckbox).click();
    }
}
