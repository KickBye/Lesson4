package FirstTests;

import javaSimple.ForConstructo;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{
    String firstParam = "Кто винговат";
    String secondParam = "NoBody";
    @Parameters({"IDont","IKnow"})

    @Test
    public void startTest( String firstParam, String secondParam) {
        System.out.println("Первый параметр"+firstParam);
        System.out.println("Второй параметр"+secondParam);
        System.out.println("Но на самом деле"+this.firstParam+" "+this.secondParam);

        this.firstParam=firstParam;
        this.secondParam=secondParam;

    }

    @Test(priority = 2)
    public void startTest() {
        System.out.println("Первый параметр"+firstParam);
        System.out.println("Второй параметр"+secondParam);
        System.out.println("Но на самом деле"+this.firstParam+" "+this.secondParam);
    }

    @Test(priority = 1)
    public void startTest2() {
        ForConstructo con = new ForConstructo();
        System.out.println("Первый параметр"+firstParam);
        System.out.println("Второй параметр"+secondParam);
        System.out.println("Но на самом деле"+con.constParam1+" "+con.constParam2);

    }
}
