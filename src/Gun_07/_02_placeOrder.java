package Gun_07;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _02_placeOrder extends GenelWebDriver {

    @Test
    void proceedToCheckout () {

        WebElement src = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("search"))));
        src.sendKeys("ipod");

        WebElement btn = driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        btn.click();

        List<WebElement> sonuc = driver.findElements(By.cssSelector("[class*='product-layout product-grid']"));
        wait.until(ExpectedConditions.elementToBeClickable(sonuc.get(0)));
        sonuc.get(0).click();

        WebElement btn_cart =wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button-cart"))));
        btn_cart.click();

        WebElement shop=wait.until(ExpectedConditions.visibilityOf((driver.findElement(By.id("cart-total")))));
        shop.click();

        WebElement check = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Checkout']"))));
        check.click();

        WebElement adres_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button-payment-address"))));
        adres_btn.click();

        WebElement ship_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button-shipping-address"))));
        ship_btn.click();

        WebElement dlvr_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button-shipping-method"))));
        dlvr_btn.click();

        WebElement agree=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("agree"))));
        agree.click();

        WebElement pymnt_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button-payment-method"))));
        pymnt_btn.click();

        WebElement cnfrm_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button-confirm"))));
        cnfrm_btn.click();

        WebElement control =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Your order has been placed!']"))));
        Assert.assertTrue(control.getText().contains("has been placed"));


    }
}
