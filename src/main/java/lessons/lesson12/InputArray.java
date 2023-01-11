package lessons.lesson12;

import java.util.Scanner;

public class InputArray {

    public int [] userInput(){

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter size of array- ");
        int size = scanner.nextInt();

        int [] createdArray = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Please enter " + i + " element of array - ");
            createdArray [i] = scanner.nextInt();
        }

        return createdArray;

    }

}
