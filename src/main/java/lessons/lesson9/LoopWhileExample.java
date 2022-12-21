package lessons.lesson9;

import java.util.Scanner;

public class LoopWhileExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        boolean condition = true;


        while (condition) {

            System.out.println("Please enter two numbers. If you will enter first number 100 - exit");

            System.out.println("Enter x number -");
            x = scanner.nextInt();

            System.out.println("Enter y number -");
            y = scanner.nextInt();

            System.out.println("Add result - " + (x + y));

            if (x==100) {condition = false;}

        }

        System.out.println("Stop loop while");

    }
}
