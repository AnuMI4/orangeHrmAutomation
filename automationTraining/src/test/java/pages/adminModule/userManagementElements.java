package pages.adminModule;

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
    By btnSave = By.id("btnSave");
    By btnDelete = By.id("btnDelete");
    //By userFionaCheckbox = By.xpath("//*[text()='"+prop.getProperty("usernameFiona2")+"']/preceding-sibling::input[@type='checkbox']");
}
