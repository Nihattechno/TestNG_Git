package Gun_01;

import org.testng.annotations.*;

public class _02_Annotations {
    /*
    @BeforeClass --> // Her class çalışıyorken önce burası çalışır
           @BeforeMetod --> // Her metoddan(test metod) önce çalışır
              @Test     -->  testlerin çalıştığı metodlar
              @Test     -->  testlerin çalıştığı metodlar
           @AfterMetod --> // Her metoddan(test metod) sonra çalışır
         @AfterClass --> // Her class çalışıyorken sonra burası çalışır
     */
    @BeforeClass
    void beforeClass (){
        System.out.println("Her classtan önce çalışacak : BeforeClass");
    }
    @BeforeMethod
    void beforeMethod () {
        System.out.println("Her test methoddan önce çalışacak : BeforeMethod");
    }
    @Test
    void test1 (){
        System.out.println("Test1 çalıştı");
    }
    @Test
    void test2 () {
        System.out.println("Test2 çalıştı");
    }
    @AfterMethod
    void afterMethod (){
        System.out.println("Her test methoddan sonra çalışacak");
    }
    @AfterClass
    void afterClass () {
        System.out.println("Her classtan sonra çalışacak");
    }
}
