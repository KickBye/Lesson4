package firstTests;

import javaSimple.ForConstructo;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest{

    String firstParam = "Кто винговат";
    String secondParam = "NoBody";

    @Parameters({"IDont","IKnow"})


//чтобы параметры через pom файл и через файл перешли сюда нужно запускать через мавен
    //@Optional аннотация чтобы обозначить что параметр необязательный
    @Test
    public void startTest(String firstParam,String secondParam) {
        System.out.println("Третий ТЕСТ!!!!!!!!!!!");
        System.out.println("Первый параметр "+firstParam);
        System.out.println("Второй параметр "+secondParam);
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
        //передача через классы
        ForConstructo con = new ForConstructo();
        System.out.println("Первый параметр"+firstParam);
        System.out.println("Второй параметр"+secondParam);
        System.out.println("Но на самом деле"+con.constParam1+" "+con.constParam2);

    }
}
