package lessons.lesson6.exampleString;


import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator ourCalculator = new Calculator();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter integer x - ");
        int x = scanner.nextInt();

        System.out.println("Please, enter integer y - ");
        int y = scanner.nextInt();

        int resultAdd = ourCalculator.add(x,y);

        System.out.println("Add result is  : " + resultAdd);

        int resultMinus= ourCalculator.minus(x,y);
        System.out.println("Minus operation result is : " +resultMinus);

        int resultMultiplocation = ourCalculator.multiplication(x,y);
        System.out.println("Multiplication result is  :  " + resultMultiplocation);

        double resultDiv = CalculatorSpecial.div(x,y);
        System.out.println("Division result is : "+ resultDiv);

        double exponent = Math.pow(x,y);
        System.out.println("Exponent is :"+ exponent);

    }


}
