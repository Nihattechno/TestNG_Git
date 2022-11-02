package FridayProjects.Project_05.Pages;

import Utils.GenelWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Pom_P_05 {
    public Pom_P_05(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Log in")
    public WebElement Login;

    @FindBy(id = "Email")
    public WebElement mail;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(css = "[value='Log in']")
    public WebElement Login_Button;

    @FindBy(css = "[class='topic-html-content-title']>h2")
    public WebElement welcome;

    @FindBy(css = "[class='validation-summary-errors']>span")
    public WebElement error;

    @FindBy(linkText = "14.1-inch Laptop")
    public WebElement urun;

    @FindBy(id = "add-to-cart-button-31")
    public WebElement cartbutton;

    @FindBy(xpath = "//span[text()='Shopping cart']")
    public WebElement shopcart;

    @FindBy(id = "CountryId")
    public WebElement country;

    @FindBy(css = "[id='CountryId'] option")
    public List<WebElement> ulkeler;

    @FindBy(name = "ZipPostalCode")
    public WebElement zipcode;

    @FindBy(id = "termsofservice")
    public WebElement agree;

    @FindBy(id = "checkout")
    public WebElement checkout;

    @FindBy(css = "[id='billing-buttons-container']>input")
    public WebElement adress_ctn;

    @FindBy(css = "[onclick='Shipping.save()']")
    public WebElement ship_btn;

    @FindBy(css = "[onclick='ShippingMethod.save()']")
    public WebElement ship_mtd;

    @FindBy(css = "[onclick='PaymentMethod.save()']")
    public WebElement payment_btn;

    @FindBy(css = "[onclick='PaymentInfo.save()']")
    public WebElement pymnt_info;

    @FindBy(css = "[onclick='ConfirmOrder.save()']")
    public WebElement confirm;

    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    public WebElement success;
}
