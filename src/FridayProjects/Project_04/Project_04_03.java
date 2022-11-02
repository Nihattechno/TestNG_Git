package FridayProjects.Project_04;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Project_04_03 extends GenelWebDriver {

    @Test
    void placeOrder () {
        driver.get("https://demowebshop.tricentis.com/login");

        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("ogr1@gmail.com");

        WebElement pasword= driver.findElement(By.id("Password"));
        pasword.sendKeys("hummel91");

        WebElement lgn_btn = driver.findElement(By.cssSelector("[value='Log in']"));
        lgn_btn.click();

        WebElement laptop=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("14.1-inch Laptop"))));
        laptop.click();

        WebElement add_cart=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("add-to-cart-button-31"))));
        add_cart.click();

        WebElement shop_cart= wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("shopping cart"))));
        shop_cart.click();

        List<WebElement> ulke=driver.findElements(By.cssSelector("[id='CountryId'] option"));
        int random=(int)(Math.random()*ulke.size());
        System.out.println(random);

        WebElement country=driver.findElement(By.id("CountryId"));
        Select ccMenu=new Select(country);
        ccMenu.selectByIndex(random);

        WebElement postal= driver.findElement(By.id("ZipPostalCode"));
        postal.sendKeys("454545");

      /*  if (country.getText().contains("United States") || country.getText().contains("Canada"))
        {
            wait.until(ExpectedConditions.stalenessOf(country));
        List<WebElement> liste=driver.findElements(By.cssSelector("[id='StateProvinceId'] option"));
        int random2=(int)(Math.random()*liste.size());
        System.out.println(random2);
        WebElement state=driver.findElement(By.id("StateProvinceId"));
        Select ssMenu=new Select(state);
        ssMenu.selectByIndex(random2);
        }*/

        WebElement terms= driver.findElement(By.id("termsofservice"));
        terms.click();

        WebElement check = driver.findElement(By.id("checkout"));
        check.click();

        WebElement billing_adres_slect=driver.findElement(By.id("billing-address-select"));
        Select blmenu=new Select(billing_adres_slect);
        wait.until(ExpectedConditions.visibilityOf(billing_adres_slect));
        blmenu.selectByVisibleText("New Address");

        List<WebElement> adres_ulke=driver.findElements(By.cssSelector("[id='BillingNewAddress_CountryId'] option"));
        WebElement adres_country= driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select ddmenu=new Select(adres_country);
        ddmenu.selectByIndex(random);


        WebElement bill_city=driver.findElement(By.id("BillingNewAddress_City"));
        bill_city.sendKeys("hamburg");

        WebElement bill_adres=driver.findElement(By.id("BillingNewAddress_Address1"));
        bill_adres.sendKeys("adasdasadsa");

        WebElement bill_postal=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        bill_postal.sendKeys("4545454");

        WebElement bill_phone=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        bill_phone.sendKeys("787878");

        WebElement ctn_btn=driver.findElement(By.cssSelector("[onclick='Billing.save()']"));
        ctn_btn.click();

        WebElement bill_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[onclick='Shipping.save()']"))));
        bill_btn.click();

        WebElement ship_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[onclick='ShippingMethod.save()']"))));
        ship_btn.click();

        WebElement payment=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("paymentmethod_3"))));
        payment.click();

        WebElement pay_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[onclick='PaymentMethod.save()']"))));
        pay_btn.click();

        WebElement po_number=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("PurchaseOrderNumber"))));
        po_number.sendKeys("859685");

        WebElement payment_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[onclick='PaymentInfo.save()']"))));
        payment_btn.click();

        WebElement confirm_btn=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("[onclick='ConfirmOrder.save()']"))));
        confirm_btn.click();


        WebElement result =wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("[class='title']>strong"))));
        Assert.assertTrue(result.isDisplayed());
    }
}
