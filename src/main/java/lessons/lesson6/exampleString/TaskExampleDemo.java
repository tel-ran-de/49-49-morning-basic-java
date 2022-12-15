package lessons.lesson6.exampleString;

import java.util.Scanner;

public class TaskExampleDemo {
    public static void main(String[] args) {
        TaskExample4 tasks= new TaskExample4();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter integer x - ");
        int x = scanner.nextInt();


        boolean checkResult = tasks.isEven(x);

        System.out.println("Even detected " + x + " is " + checkResult);

    }

}
