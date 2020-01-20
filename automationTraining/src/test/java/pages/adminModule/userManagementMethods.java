package pages.adminModule;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import config.getConfig;
import org.openqa.selenium.WebElement;
import pages.general.generalMethods;

public class userManagementMethods {

    WebDriver driver;
    userManagementElements ume;
    Properties prop;
    generalMethods gm;
    public String generatedString;

    public userManagementMethods(WebDriver driver){
        this.driver = driver;
        this.ume = new userManagementElements();
        this.prop = getConfig.getProperty();
        this.gm = new generalMethods();
    }

    public void userSearchByUsername(){

        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        driver.findElement(ume.btnReset).click();
        driver.findElement(ume.username).sendKeys(generatedString);
        driver.findElement(ume.btnSearch).click();

        List<WebElement> rows = driver.findElement(ume.usersTable).findElements(ume.row);
        System.out.println(rows.size());

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(ume.column);
            for (WebElement col : cols) {
                System.out.print(col.getText() + "\t");
            }
            System.out.println();
        }
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

        String randomGenerator = "1234567890";
        generatedString = "user "+gm.generateString(new Random(), randomGenerator, 10);

        driver.findElement(ume.addNewUsername).sendKeys(generatedString);
        driver.findElement(ume.addNewPassword).sendKeys(prop.getProperty("userPassword"));
        driver.findElement(ume.confirmNewPassword).sendKeys(prop.getProperty("userPassword"));
        driver.findElement(ume.btnSave).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    public void userDelete(){
        driver.get(prop.getProperty("adminViewSystemsUsersPage"));
        System.out.println(generatedString);
    }
}
