package Gun_04;


/*
             @BeforeSuite
              @BeforeTest
               @BeforeGroup
                @BeforeClass
                 @BeforeMethod
                  @Test
                  @Test
                 @AfterMethod
                @AfterClass
               @AfterGroup
              @AfterTest
             @AfterSuite
 */

import org.testng.annotations.*;

public class _01_New_Annotations {
    @Test
    void test () {
        System.out.println("Test-xml");
    }
    @Test
    void test2 () {
        System.out.println("test2-xml");
    }

}
