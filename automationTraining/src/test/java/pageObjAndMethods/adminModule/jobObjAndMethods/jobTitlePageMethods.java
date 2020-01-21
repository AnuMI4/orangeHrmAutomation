package pageObjAndMethods.adminModule.jobObjAndMethods;

import config.getConfig;
import org.openqa.selenium.WebDriver;
import pageObjAndMethods.adminModule.userManagementObjAndMethods.userManagementElements;
import java.util.Properties;

public class jobTitlePageMethods {

    WebDriver driver;
    Properties prop;
    jobTitlePageElements jtpe;
    userManagementElements ume;

    public jobTitlePageMethods(WebDriver driver){
        this.driver = driver;
        this.prop = getConfig.getProperty();
        this.jtpe =new jobTitlePageElements();
        this.ume = new userManagementElements();
    }

    public void addJobTitle(){
        driver.get(prop.getProperty("addJobTitlePage"));
        driver.findElement(jtpe.jobTitle).sendKeys(prop.getProperty("jobTitle"));
        driver.findElement(ume.btnSave).click();
    }
}
