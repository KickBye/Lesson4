package FirstTests;

import javaSimple.ForConstructo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FourthTest extends BaseTest{
    String param1 = "Кто станет миллионером?";
    String param2 = "Никто";
    @Parameters({"params1","params2"})

    @Test
    public void startTest0( String param1, String param2) {
        System.out.println("Первый параметр"+param1);
        System.out.println("Второй параметр"+param2);
        System.out.println("Но на самом деле"+this.param1+" "+this.param2);

        this.param1=param1;
        this.param2=param2;

    }

    @Test(priority = 2)
    public void startTest1() {
        System.out.println("Первый параметр"+param1);
        System.out.println("Второй параметр"+param2);
        System.out.println("Но на самом деле"+this.param1+" "+this.param2);
    }

    @Test(priority = 1)
    public void startTest2() {
        ForConstructo con = new ForConstructo();
        System.out.println("Первый параметр"+param1);
        System.out.println("Второй параметр"+param2);
        System.out.println("Но на самом деле"+this.param1+" "+this.param2);
        System.out.println("Но на самом деле"+con.constParam1+" "+con.constParam2);

    }
}
