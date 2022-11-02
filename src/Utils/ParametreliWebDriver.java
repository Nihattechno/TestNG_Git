package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class ParametreliWebDriver {

    public  WebDriver driver;
    public static WebDriverWait wait;

    @Parameters("browser")
    @BeforeClass
    public void driverBaslangıc (String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        LoginG();
    }

    @AfterClass
    public void driverKapanıs () {
        System.out.println("Driver işlemleri kapatıldı");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    public void LoginG () {
        WebElement mail = driver.findElement(By.id("input-email"));
        mail.sendKeys("ogr1_soyad@gmail.com");

        WebElement pasword = driver.findElement(By.id("input-password"));
        pasword.sendKeys("hummel91");

        WebElement lgn_btn = driver.findElement(By.cssSelector("[value='Login']"));
        lgn_btn.click();
    }
}
