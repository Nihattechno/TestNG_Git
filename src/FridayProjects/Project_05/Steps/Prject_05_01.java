package FridayProjects.Project_05.Steps;

import FridayProjects.Project_05.Pages.Pom_P_05;
import Utils.GenelWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Prject_05_01 extends GenelWebDriver {


    @Parameters(value = {"mail","password"})
    @Test
    void LoginTest (String mail,String password) {
        Pom_P_05 pm5 = new Pom_P_05(driver);

       wait.until(ExpectedConditions.elementToBeClickable(pm5.Login));
       pm5.Login.click();
       wait.until(ExpectedConditions.visibilityOf(pm5.mail)).sendKeys(mail);
       pm5.password.sendKeys(password);
       pm5.Login_Button.click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOf(pm5.welcome)).getText().contains("Welcome"));

    }
}
