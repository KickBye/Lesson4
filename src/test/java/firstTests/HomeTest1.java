package firstTests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HomeTest1 extends BaseTest {

    @Test
    public void StartHomeTest1() {
        System.out.println("Первый домашний тест обычный тест");

        String filePath;
        //папка в которой лежит проект
        String curDir = System.getProperty("user.dir");

        filePath = curDir + "\\src\\main\\resources\\testHome";

        //строка
        String message = null;

        //номер строки
        int i =0;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));
            //читать первую строку
            message = bf.readLine();


            System.out.println(message);

            //читать все строки
            BufferedReader bf2 = new BufferedReader(new FileReader(filePath));
            bf2.lines().forEach(s -> System.out.println(s));
        } catch (IOException e) {
            e.printStackTrace();
        }


        //проверка содержимого
        Assertion a = new Assertion();
        a.assertTrue(message.contains("Тест0"), "Проверяем совпадает первая строчка или нет");


    }


    @Parameters({"ParamOne","ParamTwo"})
    @Test
    public void StartHomeTest2(String ParamOne, String ParamTwo){
        System.out.println("Второй домашний тест через аннотации");

        // тестовая переменная
        String testValue = ParamOne;
        String testValue2 = ParamTwo;
        System.out.println(ParamOne);
        System.out.println(ParamTwo);






    }
    @Parameters({"ParamOne","ParamTwo"})
    @Test
    public void StartHomeTest3(@Optional String ParamOne,@Optional String ParamTwo){
        System.out.println("Третий домашний тест через аннотации");

        // тестовая переменная
        String testValue = ParamOne;
        String testValue2 = ParamTwo;
        System.out.println(ParamOne);
        System.out.println(ParamTwo);


            }
        }

