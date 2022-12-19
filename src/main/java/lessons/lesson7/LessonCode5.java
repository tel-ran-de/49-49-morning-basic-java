package lessons.lesson7;

/*
Написать программу, которая запрашивает у пользователя
строку и проверяет количество букв в строке.

 */

import java.util.Scanner;

public class LessonCode5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string :");
        String  userInputString = scanner.nextLine();

        int userInput = userInputString.length();

        System.out.println("Use if/else statement");

        if (userInput % 2 == 0){
            System.out.println("Your string has even chars");
        } else {
            System.out.println("Your string has not even chars");
        }


    }
}
