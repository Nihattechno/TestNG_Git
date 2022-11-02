package FridayProjects.Project_04;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_04_02 extends GenelWebDriver {

    @Test
    void invalidCredentials () {

        driver.get("https://demowebshop.tricentis.com/login");

        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("ogr1@gmail.com");

        WebElement pasword= driver.findElement(By.id("Password"));
        pasword.sendKeys("hummel92");

        WebElement lgn_btn = driver.findElement(By.cssSelector("[value='Log in']"));
        lgn_btn.click();

        WebElement control = driver.findElement(By.cssSelector("[class='validation-summary-errors']"));
        Assert.assertTrue(control.getText().contains("Login was unsuccessful. Please correct the errors and try again."));
    }
}
