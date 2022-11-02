package Gun_05;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_Contact_us extends GenelWebDriver {

    @Test
    @Parameters ("mesaj")
    void contact_Us (String mesaj) {
        WebElement contact=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.linkText("Contact Us"))));
        contact.click();

        WebElement message=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("input-enquiry"))));
        message.sendKeys(mesaj);

        WebElement s_btn= driver.findElement(By.cssSelector("[value='Submit']"));
        s_btn.click();

        WebElement result=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Contact Us']"))));
        Assert.assertTrue(result.isDisplayed());
    }
}
