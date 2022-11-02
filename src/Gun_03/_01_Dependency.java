package Gun_03;

import Utils.GenelWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
   interviewlarda sorulan bir konu : testlere öncelikleri nasıl verirsin ?

   priority, dependecy;   Nasıl kullanırsın ?
   1- priority =1 gibi sıralı rakamlar vererek bununla çalışma sırasını belirtirim.
   2- dependOnMethods : bununla kendinden önce hangi metod çalışması gerekiyor ise onu belirtirim.
      bir metodu direkt çalıştırdığınızda kendinden önce bağımlı 1  metod var ise ototmaitk onları
      önce çağırıp sonra kendisi çalışır. Fakat 2 veya daha fazla tane var ise bağımlı olduğu metod ozaman çalışamaz.
 */

public class _01_Dependency {

    @Test
    void startCar () {
        System.out.println("start car");
        Assert.fail();
    }

    @Test (dependsOnMethods = {"startCar"}) // Bu testin çalışması startCar'ın çalışmasına bağlı, o çalışmazsa bu skip olucak
    void driveCar () {
        System.out.println("drive car");
    }

    // Bu testin çalışması verilen 2 testin çalışmasına bağlı
    // Mantıken 1 çalışmadığında buda çalışmıcak ama amaç burada 1'den fazla kontrol verebildiğini göstermek
    @Test (dependsOnMethods = {"startCar","driveCar"})
    void parkCar () {
        System.out.println("park car");
    }

    // son koyduğumda ne olursa olsun bu testi çalıştır demek
    // dependency bağlamıyor onu koyduğunda
    @Test (dependsOnMethods = {"parkCar"}, alwaysRun = true)
    void stopCar () {
        System.out.println("Stop car");
    }
}
