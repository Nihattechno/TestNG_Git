package Gun_03;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.time.Duration;
import java.util.List;

public class _02_AdressFunctionality extends GenelWebDriver {

    // wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
    //bu elemanın bayatlamış hali gidene kadar bekle

    @Test
    void adressEkleme () {


        WebElement adresbook = driver.findElement(By.linkText("Address Book"));
        adresbook.click();

        WebElement newadress= driver.findElement(By.linkText("New Address"));
        wait.until(ExpectedConditions.elementToBeClickable(newadress));
        newadress.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        name.sendKeys("Nihat");

        WebElement surname = driver.findElement(By.id("input-lastname"));
        surname.sendKeys("yavse");

        WebElement company = driver.findElement(By.id("input-company"));
        company.sendKeys("North Game Dev");

        WebElement adres = driver.findElement(By.id("input-address-1"));
        adres.sendKeys("postal costal kostal");

        WebElement city = driver.findElement(By.id("input-city"));
        city.sendKeys("Hamburg");

        WebElement postal = driver.findElement(By.id("input-postcode"));
        postal.sendKeys("145541");

        WebElement country = driver.findElement(By.id("input-country"));
        Select ccMenu = new Select(country);
        ccMenu.selectByVisibleText("Germany");

        WebElement state = driver.findElement(By.id("input-zone"));
        Select zzMenu = new Select(state);
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.cssSelector("select[id='input-zone']>option"))));
        zzMenu.selectByVisibleText("Hamburg");

        WebElement cnt_btn = driver.findElement(By.cssSelector("[value='Continue']"));
        cnt_btn.click();

        Tools.succesConfirm();
    }

    @Test (dependsOnMethods = {"adressEkleme"})
    void editAdres (){

        WebElement adresbook = driver.findElement(By.linkText("Address Book"));
        adresbook.click();

        List<WebElement> edit = driver.findElements(By.linkText("Edit"));
        WebElement sonedit =edit.get(edit.size()-1);
        sonedit.click();

        WebElement name = driver.findElement(By.id("input-firstname"));
        wait.until(ExpectedConditions.visibilityOf(name));
        name.clear();
        name.sendKeys("Umut");

        WebElement surname = driver.findElement(By.id("input-lastname"));
        surname.clear();
        surname.sendKeys("seyav");

        WebElement cnt_btn = driver.findElement(By.cssSelector("[value='Continue']"));
        cnt_btn.click();

        Tools.succesConfirm();

    }

    @Test (dependsOnMethods = {"adressEkleme","editAdres"})
    void adresSilme () {

        List<WebElement> adresil = driver.findElements(By.linkText("Delete"));
        WebElement sonadres=adresil.get(adresil.size()-1);
        wait.until(ExpectedConditions.elementToBeClickable(sonadres));
        sonadres.click();

        Tools.succesConfirm();
    }
}
