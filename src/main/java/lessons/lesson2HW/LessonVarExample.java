package lessons.lesson2HW;

public class LessonVarExample {

    public static void main(String[] args) {

        // Объявляем переменные
        int x = 25;

        int y = x/5;

        int z = x + y;

        int sqr = x*x*x;

        System.out.println((sqr));

        /*
        Comment 1
        Comment 2
        Comment 3
         */

        double pi = 3.14151;

        double result = x / 5.0;

        // переменная может иметь только два значения true или false
        boolean check;

        check = (x == y);

        boolean b1 = true;

        boolean b2 = false;

        System.out.println(b1 & b2);
        System.out.println(b1 || b2);
        System.out.println(!b1);


        int a = 12;
        int b = 4;

        double res = a / b;

        System.out.println(res);


        System.out.println("X = " + x);
        System.out.println("Result = " + result);
        System.out.println("Check is - " + check);

    }
}
