package lessons.lesson12;

import java.util.Arrays;

public class ArrayExample2 {
    public static void main(String[] args) {


        int [] array = new int[3];

        array [0] = 6;
        array [1] = 9;
        //array [2] = 15;

        System.out.println(Arrays.toString(array));
        System.out.println(array[0]+array[1]+array[2]);

        String [] stringArray = new String[4];
        stringArray[0] ="word 1";
        stringArray[1] = "word 2c ";
        //stringArray[2] = "word 3";
        stringArray[3] = "word 4 ";

        System.out.println(Arrays.toString(stringArray));
        System.out.println(stringArray[0]+stringArray[1]+stringArray[2]+stringArray[3]);


    }
}
