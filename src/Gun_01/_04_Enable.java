package Gun_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class _04_Enable {

    @Test
    void test1 (){
        System.out.println("Test1 yapıldı");
    }

    @Test (enabled = false)
    void test2 (){
        System.out.println("Test2 yapıldı");
    }

    @Test
    void test3 () {
        System.out.println("Test3 yapıldı");
    }

    public static WebDriver driver;
    @BeforeClass
    void driverBaslangıc () {
        System.out.println("Driver işlemleri başlatıldı");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
    }

    @AfterClass
    void driverKapanıs () {
        System.out.println("Driver işlemleri kapatıldı");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
