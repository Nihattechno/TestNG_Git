package Gun_07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Bu sayfadaki bütün elemenalrın driverlar bağlantısı gerekiyor
// bunun için aşağıdaki consructor eklendi ve için PageFatory ile
// driver üzerinden bu (this) sayfadaki bütün elemnalar ilşkilendirildi.
// Böylece Sayfada dan nesne türetildiği zaman değil, kullanıldığı
// anda elemanların bulunması aktif oluyor.Bu yöntemle bütün sayfalarda
// aynı isimde elemanlar var ise buradaki tanımlama hepsi için geçerli hale
// gelmiş oluyor. buna yapıya Page Object Model (POM) adı veriliyor.

public class _03_Place_OrderElements {
    public _03_Place_OrderElements(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "search")
    public WebElement src;

    @FindBy(css = "[class='btn btn-default btn-lg']")
    public  WebElement btn;

    @FindBy(linkText = "iPod Classic")
    public WebElement sonuc;

    @FindBy(id = "button-cart")
    public WebElement btn_cart;

    @FindBy(id = "cart-total")
    public WebElement shop;

    @FindBy(xpath = "//span[text()='Checkout']")
    public WebElement check;

    @FindBy(id = "button-payment-address")
    public WebElement adres_btn;

    @FindBy(id = "button-shipping-address")
    public WebElement ship_btn;

    @FindBy(id = "button-shipping-method")
    public WebElement dlvr_btn;

    @FindBy(name = "agree")
    public WebElement agree;

    @FindBy(id = "button-payment-method")
    public WebElement pymnt_btn;

    @FindBy(id = "button-confirm")
    public WebElement cnfrm_btn;

    @FindBy(xpath = "//h1[text()='Your order has been placed!']")
    public WebElement control;
}
