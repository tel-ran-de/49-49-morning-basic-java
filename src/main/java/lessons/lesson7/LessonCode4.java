package lessons.lesson7;

/*
Написать программу, которая запрашивает у пользователя
целое число и выводит на консоль чётное оно или нет.

Подсказка: используйте для определения чётное число или нет
операцию остаток от деления (%). Если остаток от деления на 2
равен нулю то число чётное, иначе не чётное.

 */

import java.util.Scanner;

public class LessonCode4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number :");
        int userInput = scanner.nextInt();

        System.out.println("Use if/else statement");

        if (userInput % 2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is not even");
        }

        System.out.println("Use switch statement");

        int checkResult = userInput % 2;

        switch (checkResult) {
            case 0:
                System.out.println("Your number is even");
                break;
            default:
                System.out.println("Your number is not even");

        }


    }
}
