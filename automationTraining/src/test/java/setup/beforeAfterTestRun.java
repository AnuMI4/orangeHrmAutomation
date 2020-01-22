package setup;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class beforeAfterTestRun {

    getDriver gd;
    public static WebDriver driver;
    public String s;

    @BeforeSuite
    public void initDriver(){
        this.gd = new getDriver();
        this.driver = gd.retDriver();
    }

    @AfterSuite
    public void closeBrowserWindow(){
        driver.quit();
    }
}
