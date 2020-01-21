package testClasses.adminModule.job;

import config.getConfig;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Properties;

public class jobTitlesTestCases {

    Properties prop;

    public jobTitlesTestCases(){
        this.prop = getConfig.getProperty();
    }

    @BeforeClass
    public void initjobTitlePageElementsAndMethods(){
    }

    @Test(priority = 0)
    public void addJobTitle(){

    }

    @Test(priority = 1)
    public void deleteJobTitle(){

    }
}
