package Gun_07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class _04_PlaceOrderElements extends GenelWebDriver {

    @Test
    void proceedToCheckout () {

        _03_Place_OrderElements element = new _03_Place_OrderElements(driver);

        element.src.sendKeys("ipod");
        element.btn.click();
        wait.until(ExpectedConditions.elementToBeClickable(element.sonuc)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.btn_cart)).click();
        wait.until(ExpectedConditions.visibilityOf((element.shop))).click();

        wait.until(ExpectedConditions.elementToBeClickable(element.check)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.adres_btn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.ship_btn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.dlvr_btn)).click();
        wait.until(ExpectedConditions.visibilityOf(element.agree)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.pymnt_btn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(element.cnfrm_btn)).click();
        WebElement control =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Your order has been placed!']"))));
        Assert.assertTrue(control.getText().contains("has been placed"));


    }
}
