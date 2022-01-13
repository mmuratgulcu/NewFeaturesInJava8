package tr.com.kafein;

import javax.xml.soap.SAAJResult;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Test {

    public static void main(String... args) {
        //Integerlar immutable ve referans olarak değerlendirilmezler.

        Integer[] integers = new Integer[]{1,2,3};
        changeReference(integers);
        System.out.println(Arrays.toString(integers));

        changeValue(integers);
        System.out.println(Arrays.toString(integers));

        //integer'ın set gibi bir atama metotu olmadığından
        // metotun dönüş tipi int olup integer değişkenine yeniden atama yapılmalı.
        Integer integer = new Integer(5);

        Test2 test = new Test2();
        test.firstname="Murat";
        System.out.println(test);
        deneme(test);
        System.out.println(test);

    }
    public static void changeReference(Integer[] integers) {
        integers = new Integer[] { 4,5,6 };
    }
    public static void changeValue(Integer[] integers) {
        integers[0] = 4;
        integers[1] = 5;
        integers[2] = 6;
    }

    public static void deneme(Test2 test2){

        test2.firstname = "asd";

    }
}

class Test2{
    public String firstname;

    @Override
    public String toString() {
        return firstname;
    }
}