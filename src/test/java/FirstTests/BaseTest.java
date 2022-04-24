package FirstTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void beforeT(){
        System.out.println("Действия перед началом теста:");
    }
    @AfterTest
    public void afterT(){
        System.out.println("Действия после теста:");
    }
    @BeforeMethod
    public void beforeM(){
        System.out.println("Действия перед началом метода:");
    }
    @AfterMethod
    public void afterM(){
        System.out.println("Действия после метода:");
    }

}
