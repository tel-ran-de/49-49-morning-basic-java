package lessons.lesson7;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input you choose :");
        String userInput = scanner.nextLine();

        switch (userInput){
            case "add":
                System.out.println("You want add smth...");
                break;
            case "delete":
                System.out.println("You want delete");
                break;
            case "replace":
                System.out.println("You want replace");
                break;
            default:
                System.out.println("What do you want?");
        }



    }
}
