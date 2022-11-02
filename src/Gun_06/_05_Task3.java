package Gun_06;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _05_Task3 extends GenelWebDriver {

    @Test
    void speacialsTest () {
        WebElement spcs = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Specials"))));
        spcs.click();


        List<WebElement> newprice=driver.findElements(By.cssSelector("[class='price-new']"));
        List<WebElement> sonuc =driver.findElements(By.cssSelector("[class*='product-layout product-grid']"));
        Assert.assertEquals(newprice.size(),sonuc.size());
        List<WebElement> oldprice=driver.findElements(By.cssSelector("[class='price-old']"));
        System.out.println(newprice.size());
        System.out.println(oldprice.size());

        for (int i = 0; i < oldprice.size(); i++) {
            Assert.assertTrue(Tools.webelementtoDouble(oldprice.get(i))>Tools.webelementtoDouble(newprice.get(i)));
        }

        
    }

}
