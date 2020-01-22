package pageObjAndMethods.adminModule.userManagementObjAndMethods;

import org.openqa.selenium.By;
import java.util.Properties;
import config.getConfig;

public class userManagementElements {

    Properties prop;

    public userManagementElements(){
        this.prop = getConfig.getProperty();
    }

    By username = By.xpath("//input[@name='searchSystemUser[userName]']");
    By employeeName = By.xpath("//input[@name='searchSystemUser[employeeName][empName]']");
    By userRole = By.id("searchSystemUser_userType");
    By userStatus = By.id("searchSystemUser_status");
    By btnReset = By.xpath("//input[@value='Reset']");
    By btnSearch = By.className("searchbutton");
    By addNewEmployeeName = By.id("systemUser_employeeName_empName");
    By addNewUsername = By.id("systemUser_userName");
    By addNewPassword = By.id("systemUser_password");
    By confirmNewPassword = By.name("systemUser[confirmPassword]");
    public By btnSave = By.className("addbutton");
    public By saveUserSuccessMsg = By.xpath("//*[contains(text(),'Successfully Saved')]");
    public By btnDelete = By.id("btnDelete");
    public By usersTable = By.tagName("tbody");
    public By row = By.tagName("tr");
    public By column = By.tagName("td");
    By userCheckbox = By.xpath("//a[contains(text(), '"+ userManagementMethods.generatedNewUser+"')]/../preceding-sibling::td/input[@type='checkbox']");
    public By deleteRecordModalBtnOk = By.id("dialogDeleteBtn");
    public By deletedRecordUserSuccessMsg = By.xpath("//*[contains(text(),'Successfully Deleted')]");
}
