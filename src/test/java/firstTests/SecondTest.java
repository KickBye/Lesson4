package firstTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

//  создание второго теста, дата провайдер
public class SecondTest extends BaseTest{




    @DataProvider(name = "SetEnvironment", parallel = true)
    //создание класса, чтобы передать браузер и версию
    public Object[][] getData(){
        //создание двумерного массива
        Object[][] browserVersion = new Object[][]{
                {"Chrome","89"},
                {"Yandex","13"}
        };
        return browserVersion;
    }




@Test
    public void startTest(){
        System.out.println("вТОРОЙ ТЕСТ!!!!!!!!!!!!");

    }

@Test(dataProvider = "SetEnvironment")
    public void startTest(String browser, String vers) {
        System.out.println("Тест для " + browser + "=" + vers);



        Assertion a = new Assertion();
        a.assertTrue(vers.equalsIgnoreCase("80"));
    }
}
