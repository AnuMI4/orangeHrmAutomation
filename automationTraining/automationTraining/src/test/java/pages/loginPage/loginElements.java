package pages.loginPage;

import org.openqa.selenium.By;

public class loginElements {

    By userName = By.id("txtUsername");
    By password = By.name("txtPassword");
    By btnLogin = By.id("btnLogin");
    public By invalidCredMsg = By.id("spanMessage");

}
