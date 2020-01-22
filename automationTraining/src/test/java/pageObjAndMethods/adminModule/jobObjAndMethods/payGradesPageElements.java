package pageObjAndMethods.adminModule.jobObjAndMethods;

import config.getConfig;
import org.openqa.selenium.By;
import pageObjAndMethods.adminModule.userManagementObjAndMethods.userManagementMethods;

import java.util.Properties;

public class payGradesPageElements {

    Properties prop;

    public payGradesPageElements(){
        this.prop = getConfig.getProperty();
    }

    By addNewPayGrade = By.id("payGrade_name");
    By payGradeCheckbox = By.xpath("//a[contains(text(), '"+payGradesPageMethods.newPayGradeName+"')]/../preceding-sibling::td/input[@type='checkbox']");
}

