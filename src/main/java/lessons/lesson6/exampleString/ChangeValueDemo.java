package lessons.lesson6.exampleString;

import java.util.Scanner;

public class ChangeValueDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter integer x - ");
        int x = scanner.nextInt();

        System.out.println("Please, enter integer y - ");
        int y = scanner.nextInt();

        System.out.println("Your first number was " + x );
        System.out.println("Your second number was " + y );
        System.out.println("After change");

        int tempVariable = x;
        x = y;
        y=tempVariable;



        System.out.println("Your first number is " + x );
        System.out.println("Your second number is " + y );


        System.out.println("Second variant");

        System.out.println("Please, enter integer x - ");
        x = scanner.nextInt();

        System.out.println("Please, enter integer y - ");
        y = scanner.nextInt();

        System.out.println("Your first number was " + x );
        System.out.println("Your second number was " + y );
        System.out.println("After change");


        x = x + y;

        y = x - y;  // y = (x первоначальное +  y первоначальное) - y первоначальное   = x первоначальное

        x = x - y;  // x = (x первоначальное +  y первоначальное) -  x первоначальное  = y первоначальное


        System.out.println("Your first number is " + x );
        System.out.println("Your second number is " + y );





    }
}
