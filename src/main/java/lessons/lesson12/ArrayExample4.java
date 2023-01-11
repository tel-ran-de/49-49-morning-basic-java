package lessons.lesson12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of lines - ");
        int lineSize = scanner.nextInt();

        System.out.println("Please enter number of col - ");
        int colSize = scanner.nextInt();


        int [] [] twoDimArray = new int[lineSize][colSize];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[0].length; j++) {
                twoDimArray[i][j] = (int) (100*Math.random());
            }

        }

        System.out.println(Arrays.deepToString(twoDimArray));

    }
}
