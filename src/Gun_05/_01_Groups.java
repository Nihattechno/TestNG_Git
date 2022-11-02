package Gun_05;

import org.testng.annotations.Test;

public class _01_Groups {

    @Test (groups = "Smoke Test")
    void test1 () {
        System.out.println("Test1 Smoke Test");
    }
    @Test (groups = "Regression test")
    void test3 () {
        System.out.println("Test3 Regression Test");
    }
    @Test (groups = "Regression test")
    void test5 () {
        System.out.println("Test5 Regression Test");
    }
    @Test (groups = "Regression test")
    void test4 () {
        System.out.println("Test4 Regression Test");
    }
    @Test (groups = "Smoke Test")
    void test2 () {
        System.out.println("Test2 Smoke Test");
    }
    @Test (groups = "Smoke Test")
    void test6 () {
        System.out.println("Test6 Smoke Test");
    }

    @Test
    void test7 () {
        System.out.println("Test7");
    }
}
