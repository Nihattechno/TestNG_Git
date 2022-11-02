package FridayProjects.Project_05.Steps;

import FridayProjects.Project_05.Pages.Pom_P_05;
import Utils.GenelWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Project_05_03 extends GenelWebDriver {

    @Parameters({"mail","password"})
    @Test
    void urunEkle (String mail,String password) {
        Pom_P_05 pm1=new Pom_P_05(driver);

        wait.until(ExpectedConditions.elementToBeClickable(pm1.Login)).click();
        wait.until(ExpectedConditions.visibilityOf(pm1.mail)).sendKeys(mail);
        pm1.password.sendKeys(password);
        pm1.Login_Button.click();

        wait.until(ExpectedConditions.elementToBeClickable(pm1.urun)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pm1.cartbutton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pm1.shopcart)).click();


        int random=(int)(Math.random()*pm1.ulkeler.size());
        wait.until(ExpectedConditions.visibilityOf(pm1.country));
        Select c_menu=new Select(pm1.country);
        c_menu.selectByIndex(random);
        pm1.zipcode.sendKeys("45454");
        pm1.agree.click();
        pm1.checkout.click();

        wait.until(ExpectedConditions.elementToBeClickable(pm1.adress_ctn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pm1.ship_btn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pm1.ship_mtd)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pm1.payment_btn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pm1.pymnt_info)).click();
        wait.until(ExpectedConditions.elementToBeClickable(pm1.confirm)).click();

        wait.until(ExpectedConditions.visibilityOf(pm1.success));
        Assert.assertTrue(pm1.success.isDisplayed());


    }
}
