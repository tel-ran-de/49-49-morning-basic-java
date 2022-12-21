package lessons.lesson9;

import java.util.Scanner;

public class CompareNumbersDemo {

    /*
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.
     */
    public static void main(String[] args) {

        CompareNumbers compareNumbers= new CompareNumbers();

        compareNumbers.number1= userInput("Please, enter first number");
        compareNumbers.number2 = userInput("Please, enter second number");

        compareNumbers.printInfo(" Lesser number ", compareNumbers.compareLesser(), true);
        compareNumbers.printInfo(" Maximum number is ", compareNumbers.compareMaximum(),true);


        if (compareNumbers.isEqual()){compareNumbers.printInfo("Numbers are equals",0,false);}
        else {compareNumbers.printInfo("Numbers are different",0, false);}

    }


    public static double userInput(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();

    }

}
