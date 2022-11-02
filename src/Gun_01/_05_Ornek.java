package Gun_01;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _05_Ornek extends GenelWebDriver{

    @BeforeClass
    @Override
    public void driverBaslangıc() {
        super.driverBaslangıc();
    }

    @AfterClass
    @Override
    public void driverKapanıs() {
        super.driverKapanıs();
    }

    @Test
    void Login () {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement mail = driver.findElement(By.id("input-email"));
        mail.sendKeys("ogr1_soyad@gmail.com");

        WebElement pasword = driver.findElement(By.id("input-password"));
        pasword.sendKeys("hummel91");

        WebElement lgn_btn = driver.findElement(By.cssSelector("[value='Login']"));
        lgn_btn.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://opencart.abstracta.us/index.php?route=account/account");
    }

}
