package Gun_08;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _02_Wishlist_POM {
    public _02_Wishlist_POM(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "[data-original-title='Add to Wish List']")
    public List<WebElement> sonuc;

    @FindBy(css = "h4>a")
    public List<WebElement> names;

    @FindBy(linkText = "wish list")
    public WebElement w_list;

    @FindBy(css = "[class='table table-bordered table-hover'] tbody tr [class='text-left']>a")
    public List<WebElement> result_list;
}
