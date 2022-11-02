package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Tools {

    public static void compareToList (List<String> expectedList, List<WebElement> actualList)
    {
        for (int i = 0; i < expectedList.size(); i++) {
            Assert.assertEquals(expectedList.get(i),actualList.get(i).getText());
        }
    }

  public static void succesConfirm () {

        WebDriverWait wait=new WebDriverWait(GenelWebDriver.driver, Duration.ofSeconds(30));
        WebElement result =GenelWebDriver.driver.findElement(By.cssSelector("[class='alert alert-success alert-dismissible']"));
        wait.until(ExpectedConditions.visibilityOf(result));
        Assert.assertTrue(result.getText().toLowerCase().contains("success"));
    }

    public static void bekle (int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Double webelementtoDouble(WebElement e){
        String result= e.getText();
        result=result.replaceAll("[^\\d]","");
        return Double.parseDouble(result);
    }
}
