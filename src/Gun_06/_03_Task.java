package Gun_06;

import Utils.GenelWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _03_Task extends GenelWebDriver {

    /**
     * Aşağıdaki ikili ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılır, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     * Dataprovider bir testi birden fazla DATA ile çok çalıştırmak için kullanılır.
     * XML filer file gruplama, pararalel, ve farklı tesleri koordine edip birarada çalıştırmak için kullanılır.
     */


    @Test (dataProvider = "data")
    void searchFunc (String girdi){
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
    public Object [] data (){
        Object[] arama={"samsung","mac","ipod"};
        return arama;
    }
}
