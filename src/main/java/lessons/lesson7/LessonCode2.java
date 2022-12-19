package lessons.lesson7;

import java.util.Scanner;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль
положительное оно, отрицательное или равно нулю.
 */

public class LessonCode2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your figure - ");
        String userInput = scanner.nextLine();

//      if (userInput включает в себя символы только цифры или знак "-")

        if (userInput.matches("[0-9-]+")) {

            if (Integer.parseInt(userInput) < 0) {
                System.out.println("Your figure is negative!");
            } else if (Integer.parseInt(userInput) > 0) {
                System.out.println("Your figure is positive!");
            } else if (Integer.parseInt(userInput) == 0) {
                System.out.println("Your figure is 0");
            }

        } else {
            System.out.println("How is it possible?");
        }


    }
}
