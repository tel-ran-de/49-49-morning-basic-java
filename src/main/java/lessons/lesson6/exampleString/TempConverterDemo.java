package lessons.lesson6.exampleString;

import java.util.Scanner;

public class TempConverterDemo {

    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your temperature - ");
        double inputTemperature = scanner.nextDouble();

        System.out.println("Your temperature is " + inputTemperature);

        double resultConvertCelsiumFar = temperatureConverter.convertCelsiumFarengait(inputTemperature);
        System.out.println("Temperature in F is " + resultConvertCelsiumFar);

        System.out.println("Temperature in K is " + temperatureConverter.convertCelsiumKelvin(inputTemperature));

    }
}
