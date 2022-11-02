package Gun_06;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_Data_Provider {
    /*
     * Aşağıdaki ikli ile Dataproviderın içindeki bütün veriler tek tek test e gönderilerek
     * data sayısı kadar test çalıştırılı, dataların olduğu yere DataProvider annottion ı konur.
     * çalıştırılacak teste ise dataProvider = "getData"  bölümü eklenir.
     */

    @Test (dataProvider = "getData")
    void Username (String username) {

        System.out.println("username= "+username);
    }

    @DataProvider // bu metoda dataprovider görevi
    public Object[] getData (){

        Object [] username={"Umut","Nihat","Yavuz"};
        return username;
    }



    /****************************************************************/

    // Data provider methodunun ismiyle çağırmak dışında annotations'a da isim verip onunla da
    // data provider çağırılabilir.
    @Test (dataProvider = "userlar") // DataProviderın ismi burda metod adı yerine kullanıldı.
    void Username2 (String username) {

        System.out.println("username= "+username);
    }

    @DataProvider (name = "userlar") // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
    public Object[] getData2 (){

        Object [] username={"Umut","Nihat","Yavuz"};
        return username;
    }


}
