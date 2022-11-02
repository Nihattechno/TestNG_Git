package Gun_07;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert_vs_HardAssert {

    @Test
    void hardAssert (){

        String s1="Merhaba";

        Assert.assertEquals("merhaba123",s1,"Assert hard sonucu");
        System.out.println("Fail sonrası");
    }

    @Test
    void softAssert () {

        String s1="merhaba123";
        String s2="123merhaba";
        String s3="merhaba";

        SoftAssert s_Assert=new SoftAssert();

        s_Assert.assertEquals(s1,"merhaba123"); // true
        System.out.println("s1 sonucu");

        s_Assert.assertEquals(s2,"merhaba"); // fail
        System.out.println("s2 sonucu");

        s_Assert.assertEquals(s3,"123merhaba"); // fail
        System.out.println("s3 sonucu");

        s_Assert.assertAll();
        System.out.println("AssertAll sonrası sonuç"); // Bunu yazmaz çünkü assertAll'da break yapar
    }


}
