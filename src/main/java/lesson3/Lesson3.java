package lesson3;

public class Lesson3 {

    public static void main(String[] args) {

        int a1 = 10;
        int b1 = 15;

        int a2 = 100;
        int b2 = 150;

        int result1 = sum(a1,b1);

        printText(1, result1);

        printText(2,sum(a2,b2));

    }

    //=================================

    public static int sum (int x, int y){
        int sum = x + y;
        return sum;
    }

    //=================================
    public static void printText (int i, int text){
        System.out.println("Result sum " + i +  " = " + text);
    }

}
