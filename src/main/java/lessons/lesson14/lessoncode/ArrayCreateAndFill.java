package lessons.lesson14.lessoncode;

import java.util.Scanner;

public class ArrayCreateAndFill {

     int[] createArray(int arraySize) {
        int[] createdArray = new int [arraySize];
        return createdArray;
    }

    public void fillArray(int[] workingArray, boolean createArrayRandom, int randomRange){

        if (createArrayRandom) {
            fillArrayByRandom(workingArray,randomRange);
        } else {
            fillArrayByUserInput(workingArray);
        }

    }

    public void fillArrayByRandom (int [] workingArray, int randomRange){

        for (int i = 0; i < workingArray.length; i++) {
            workingArray[i] = (int) (Math.random()*randomRange);
        }
    }

    public void fillArrayByUserInput(int[] workingArray){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill array data.");

        for (int i = 0; i < workingArray.length; i++) {
            System.out.println("Please enter data for " + i + " element: ");
            workingArray[i] = scanner.nextInt();
        }

    }


}
