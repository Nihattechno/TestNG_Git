package Gun_06;

import Utils.ParametreliWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Task2 extends ParametreliWebDriver {

    @Test (dataProvider = "getData")
    void searchFunc (String girdi) {

        WebElement src = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("search"))));
        src.clear();
        src.sendKeys(girdi);

        WebElement btn= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        btn.click();

        List<WebElement> urunler=driver.findElements(By.cssSelector("h4>a"));
        for (WebElement x:urunler)
        {
            Assert.assertTrue(x.getText().toLowerCase().contains(girdi));
        }
    }

    @DataProvider
    public Object[] getData () {

        Object [] data={"samsung","mac","ipod"};
        return data;
    }
}
