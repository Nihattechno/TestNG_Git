package Gun_01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _03_Assertions {
    String s1 ="İyi akşamlar";
    String s2 = "Merhaba";
    int a =5;
    int b=7;
    // Yeşil tick geçti
    // Kırmızımsı çarpı geçmedi
    // Beyaz skip etti

    @Test
    void Equals () {
        Assert.assertEquals(s1,s2,"Karşılaştırma sonucu");
        // Actual
        // Expected
    }

    @Test
    void NotEquals () {
        Assert.assertNotEquals(s1,s2,"Eşit değil karşılaştırma");
    }

    @Test
    void AssertTrue (){
        Assert.assertTrue(a==b,"True karşılaştırma sonucu");
    }

    @Test
    void AssertNull () {
        Assert.assertNull(s1);
    }

    @Test
    void AssertFail () {
        Assert.fail();
    }

}
