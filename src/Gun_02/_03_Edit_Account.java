package Gun_02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.time.Duration;

public class _03_Edit_Account extends GenelWebDriver {

    @Test
    void editAccount (){
      editAccount2("nihat","hummek");
        Tools.bekle(2);
        editAccount2("ogr6","ogrsoyad6");
    }

    void editAccount2 (String ad, String soyad){
        wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement edit = driver.findElement(By.linkText("Edit Account"));
        wait.until(ExpectedConditions.elementToBeClickable(edit));
        edit.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        wait.until(ExpectedConditions.visibilityOf(name));
        name.clear();
        name.sendKeys(ad);

        WebElement lastname = driver.findElement(By.id("input-lastname"));
        lastname.clear();
        lastname.sendKeys(soyad);

        WebElement btn =driver.findElement(By.cssSelector("input[value='Continue']"));
        btn.click();

        Tools.succesConfirm();
    }

}
