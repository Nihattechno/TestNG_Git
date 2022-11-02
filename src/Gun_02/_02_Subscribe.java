package Gun_02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _02_Subscribe extends GenelWebDriver {



    @Test (priority = 1)
    void subscribeYes (){
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement newsletter = driver.findElement(By.linkText("Newsletter"));
        wait.until(ExpectedConditions.visibilityOf(newsletter));
        newsletter.click();

        WebElement yes  = driver.findElement(By.cssSelector("input[value='1']"));
        wait.until(ExpectedConditions.visibilityOf(yes));
        yes.click();

        WebElement contin = driver.findElement(By.cssSelector("[value='Continue']"));
        contin.click();

        WebElement result = driver.findElement(By.xpath("//*[text()=' Success: Your newsletter subscription has been successfully updated!']"));
        wait.until(ExpectedConditions.visibilityOf(result));
        Assert.assertTrue(result.isDisplayed());
    }

    @Test (priority = 2)
    void subscribeNo () {
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement newsletter = driver.findElement(By.linkText("Newsletter"));
        wait.until(ExpectedConditions.visibilityOf(newsletter));
        newsletter.click();

        WebElement no  = driver.findElement(By.cssSelector("input[value='0']"));
        wait.until(ExpectedConditions.visibilityOf(no));
        no.click();

        WebElement contin = driver.findElement(By.cssSelector("[value='Continue']"));
        contin.click();

        Tools.succesConfirm();
    }
    @Test (priority = 3)
    void subscribeCheck () {
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement newsletter = driver.findElement(By.linkText("Newsletter"));
        wait.until(ExpectedConditions.visibilityOf(newsletter));
        newsletter.click();


        WebElement yes  = driver.findElement(By.cssSelector("input[value='1']"));
        wait.until(ExpectedConditions.visibilityOf(yes));

        WebElement no  = driver.findElement(By.cssSelector("input[value='0']"));
        wait.until(ExpectedConditions.visibilityOf(no));

        if (yes.isSelected()){
            no.click();
        }
        else {
            yes.click();
        }

        WebElement contin = driver.findElement(By.cssSelector("[value='Continue']"));
        contin.click();

        WebElement result = driver.findElement(By.xpath("//*[text()=' Success: Your newsletter subscription has been successfully updated!']"));
        wait.until(ExpectedConditions.visibilityOf(result));
        Assert.assertTrue(result.isDisplayed());
    }

}
