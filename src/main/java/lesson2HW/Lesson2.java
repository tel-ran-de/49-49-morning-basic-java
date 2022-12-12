package lesson2HW;

import org.w3c.dom.ls.LSOutput;

public class Lesson2 {

    public static void main(String[] args) {


        String textMain = "Это текстовая строка";

        System.out.println(textMain);

        int a = 1000;
        int b = 500;

        double sum = a + b;

        double discount = sum * (10.0 / 100);

        System.out.println(discount);

        double result = sum - discount;

        String textResultInfo = "Result with discount - ";

        System.out.println(textResultInfo + result);

        // byte -> short -> int -> long
        //

        double x1= 10.5;
        double x2 = 2.5;

        double resDouble = x1/x2;

        int resInt = (int) (x1/x2);


        System.out.println(resDouble + "   " + resInt);



        String name1 = "Ivan";

        String name2 = "Petr";

        System.out.println("Hi, "+name1+ "! How are you?");
        System.out.println("Hi, "+name2+ "! How are you?");

        String text1 = "Hello";
        String text2 = "World!";

        char letter = 'a';

        String text3 = text1 + " "+ text2;

        System.out.println(text3);

        System.out.println("Text on the screen");
        System.out.println("New text  - " + text1);
        System.out.println("Third text - " + text2 + " Hello!");







    }

}
