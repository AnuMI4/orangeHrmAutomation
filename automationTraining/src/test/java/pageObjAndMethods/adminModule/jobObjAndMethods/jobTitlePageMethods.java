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
    public static String newJobTitle;

    public jobTitlePageMethods(WebDriver driver){
        this.driver = driver;
        this.prop = getConfig.getProperty();
        this.jtpe = new jobTitlePageElements();
        this.ume = new userManagementElements();
    }

    public void addJobTitle(){
        driver.get(prop.getProperty("addJobTitlePage"));
        driver.findElement(jtpe.jobTitle).sendKeys(prop.getProperty("jobTitle"));
        driver.findElement(jtpe.saveBtn).click();
    }

    public void deleteJobTitle(){
        driver.get(prop.getProperty("jobTitlePage"));
        newJobTitle = prop.getProperty("jobTitle");
        jtpe = new jobTitlePageElements();
        driver.findElement(jtpe.jobTitleCheckBox).click();
        driver.findElement(ume.btnDelete).click();
        driver.findElement(ume.deleteRecordModalBtnOk).click();
    }

}
