package Gun_02;

import Utils.GenelWebDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _01_ValidateMenu extends GenelWebDriver {

    @Test
    void desktopMenuValidation (){
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Desktops");
        expectedList.add("Laptops & Notebooks");
        expectedList.add("Components");
        expectedList.add("Tablets");
        expectedList.add("Software");
        expectedList.add("Phones & PDAs");
        expectedList.add("Cameras");
        expectedList.add("MP3 Players");

        By menufinder=By.cssSelector("ul[class='nav navbar-nav']>li");
        List<WebElement> actualList = driver.findElements(menufinder);

        Tools.compareToList(expectedList,actualList);
    }


}
