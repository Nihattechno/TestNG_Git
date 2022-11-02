package Gun_01;

import org.testng.annotations.Test;

// Eğer ki bir sıra vermezsen metod adının alfabetik sırasına göre yapar testleri
// Eğer ilk harfi büyükse ilk ondan başlar veya sırayı büyük harfliye göre düzenler
public class Giris {

    @Test (priority = 2) // Bu bölgedeki yazılan şeylere annotation denir
    void websitesiniac (){
        System.out.println("Web Sitesi açıldı");
    }

    @Test(priority = 1)
    void LoginTestIsleminiYap () {
        System.out.println("Login test işlemi yapıldı");
    }

    @Test(priority = 3)
    void driveriKapat () {
        System.out.println("Chrome ve driver kapatıldı");
    }
}

