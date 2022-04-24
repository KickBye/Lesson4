package FirstTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class SecondTest extends BaseTest{

    @DataProvider(name = "SelfEnvironment", parallel = true)
    public Object[][] getData(){
        Object[][] browserVersion = new Object[][]{
                {"Chrome","89"},
                {"Yandex","13"}
        };
        return browserVersion;
    }
@Test
    public void startTest(){
        System.out.println("Старт теста");

    }
    @Test(dataProvider = "SelfEnvironment")
    public void startTest(String browser, String vers) {
        System.out.println("Тест для " + browser + "=" + vers);

        Assertion a = new Assertion();
        a.assertTrue(vers.equalsIgnoreCase("80"));
    }
}
