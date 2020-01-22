package pageObjAndMethods.adminModule.jobObjAndMethods;

import config.getConfig;
import org.openqa.selenium.WebDriver;
import pageObjAndMethods.adminModule.userManagementObjAndMethods.userManagementElements;
import java.util.Properties;

public class payGradesPageMethods {

    WebDriver driver;
    Properties prop;
    payGradesPageElements pgpe;
    userManagementElements ume;
    public static String newPayGradeName;

    public payGradesPageMethods(WebDriver driver){
        this.driver = driver;
        this.prop = getConfig.getProperty();
        this.pgpe = new payGradesPageElements();
        this.ume = new userManagementElements();
    }

    public void addPayGrade(){
        driver.get(prop.getProperty("addPayGradesPage"));
        driver.findElement(pgpe.addNewPayGrade).sendKeys(prop.getProperty("payGradeName"));
        driver.findElement(ume.btnSave).click();
    }

    public void deletePayGrade(){
        driver.get(prop.getProperty("payGradesPage"));
        newPayGradeName = prop.getProperty("payGradeName");
        pgpe = new payGradesPageElements();
        driver.findElement(pgpe.payGradeCheckbox).click();
        driver.findElement(ume.btnDelete).click();
        driver.findElement(ume.deleteRecordModalBtnOk).click();
    }
}


