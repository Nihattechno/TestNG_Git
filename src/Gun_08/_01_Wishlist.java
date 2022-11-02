package Gun_08;

import Gun_07._03_Place_OrderElements;
import Utils.GenelWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_Wishlist extends GenelWebDriver {

    @Test
    @Parameters ("search1")
    void Wishlist (String girdi){

        //Burada daha önce oluşturduğumuz classtan çağırdık
        _03_Place_OrderElements poe = new _03_Place_OrderElements(driver);

        poe.src.sendKeys(girdi);
        poe.btn.click();

        _02_Wishlist_POM task=new _02_Wishlist_POM(driver);

        int x=(int)(Math.random()*task.sonuc.size()-1);
        wait.until(ExpectedConditions.elementToBeClickable( task.sonuc.get(x))).click();
        String rndmnmbr=task.names.get(x).getText();
        System.out.println();

        wait.until(ExpectedConditions.elementToBeClickable(task.w_list)).click();

        boolean xd=false;
        for (WebElement y: task.result_list)
        {
            if (y.getText().equals(rndmnmbr)){
                xd=true;
                break;
        }
        }
        Assert.assertTrue(xd);

    }
}
