package pageObjAndMethods.adminModule.jobObjAndMethods;

import config.getConfig;
import org.openqa.selenium.By;
import java.util.Properties;

public class jobTitlePageElements {

    Properties prop;

    public jobTitlePageElements(){
        this.prop = getConfig.getProperty();
    }

    By jobTitle = By.name("jobTitle[jobTitle]");
    By saveBtn = By.id("btnSave");
    By jobTitleCheckBox = By.xpath("//a[contains(text(), '"+jobTitlePageMethods.newJobTitle+"')]/../preceding-sibling::td/input[@type='checkbox']");
}
