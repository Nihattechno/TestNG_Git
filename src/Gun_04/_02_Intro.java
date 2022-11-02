package Gun_04;

import org.testng.annotations.*;

public class _02_Intro {
    @BeforeSuite
    void bSuite () {
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    void bTest () {
        System.out.println("BeforeTest");
    }

    @BeforeGroups
    void bGroup () {
        System.out.println("BeforeGrouo");
    }

    @BeforeClass
    void bClass () {
        System.out.println("BeforeClass");
    }

    @BeforeMethod
    void bMethod () {
        System.out.println("BeforeMethod");
    }

    @Test
    void test () {
        System.out.println("Test");
    }
    @Test
    void test2 () {
        System.out.println("test2");
    }
    @AfterMethod
    void aMethod () {
        System.out.println("AfterMethod");
    }
    @AfterClass
    void aClass () {
        System.out.println("AfterClass");
    }
    @AfterGroups
    void aGroups () {
        System.out.println("AfterGroup");
    }
    @AfterTest
    void aTest () {
        System.out.println("AfterTest");
    }
    @AfterSuite
    void aSuite () {
        System.out.println("AfterSuite");
    }
}
