package FridayProjects.Project_04;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Project_04_01 extends GenelWebDriver {

    @Test ()
    void loginTest () {
        driver.get("https://demowebshop.tricentis.com/login");

        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("ogr1@gmail.com");

        WebElement pasword= driver.findElement(By.id("Password"));
        pasword.sendKeys("hummel91");

        WebElement lgn_btn = driver.findElement(By.cssSelector("[value='Log in']"));
        lgn_btn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://demowebshop.tricentis.com/"));
    }
}
