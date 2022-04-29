package firstTests;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstTest extends BaseTest{
    //если аннотация перед классом, то для каждого метода срабатывает
    @Test

    public void startTest(){
        System.out.println("Первый тест");
        //папка в которой лежит проект
        String curDir = System.getProperty("user.dir");
        //ОС в которой находимся
        System.out.println(System.getProperty("os.name"));

        //строка путь к файлу
        String filePath;

        //contains - содержит
        //путь для виндовс
        if (System.getProperty("os.name").contains("Windows")){
            filePath=curDir+"\\src\\main\\resources\\test";
        } else {
            //путь для линукс
            filePath=curDir+"/src/main/resources/test";
        }


        //хотим прочитать файл из resources
        String line=null;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));
            //читать первую строку
            line= bf.readLine();

            //читать все строки
            BufferedReader bf2 = new BufferedReader(new FileReader(filePath));
            bf2.lines().forEach(s-> System.out.println("Строка файла"+s));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(line);


        //создаем объект класса, создание проверки
        Assertion a1 = new Assertion();
        a1.assertTrue(line.contains("фыыыыыы"),"Проверяем что текст содержит");
    }

}
