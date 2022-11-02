package Gun_05;

import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Search_Functionality extends ParametreliWebDriver {

    @Test
    @Parameters ({"girdi","kontrol"})
    void aramaYap (String girdi,String kontrol) {

        WebElement search=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("search"))));
        search.sendKeys(girdi);

        WebElement src_btn= driver.findElement(By.cssSelector("[class='input-group-btn']>button"));
        src_btn.click();

        List<WebElement> liste=driver.findElements(By.cssSelector("[id='content']>:nth-child(8) [class*='product-layout product']"));
        for (WebElement x:liste)
        {
            Assert.assertTrue(x.getText().toLowerCase().contains(kontrol));
        }


    }
}
