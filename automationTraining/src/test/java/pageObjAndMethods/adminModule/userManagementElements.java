package pageObjAndMethods.adminModule;

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
    By btnReset = By.xpath("//input[@value='Reset']");
    By btnSearch = By.className("searchbutton");
    By addNewEmployeeName = By.id("systemUser_employeeName_empName");
    By addNewUsername = By.id("systemUser_userName");
    By addNewPassword = By.id("systemUser_password");
    By confirmNewPassword = By.name("systemUser[confirmPassword]");
    By btnSave = By.className("addbutton");
    public By saveUserSuccessMsg = By.xpath("//*[contains(text(),'Successfully Saved')]");
    By btnDelete = By.id("btnDelete");
    By usersTable = By.id("resultTable");
    By row = By.tagName("tr");
    By column = By.tagName("td");
    //By userCheckbox = By.xpath("//*[text()='"+prop.getProperty("usernameFiona2")+"']/preceding-sibling::input[@type='checkbox']");
}
