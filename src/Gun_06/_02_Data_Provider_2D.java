package Gun_06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_Data_Provider_2D {

    @Test (dataProvider = "getData")
    void Username (String username,String password) {

        System.out.println("username= "+username+" password= "+password);
    }

    @DataProvider
    public Object[][] getData (){

        Object [][] username={{"Umut","12345"},{"Nihat","45678"},{"Yavuz","78978"}};
        return username;
    }
}


