package lessons.lesson13.workWithArray;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {

        // input array size
        // create array
        // fill array
        // find max , min
        // split array
        // sort

    // ---- cоздание экземляров наших рабочих классов -----

        ArrayCreateAndFill arrayCreateAndFill = new ArrayCreateAndFill();
        UserInterface userInterface = new UserInterface();
        ArrayUtil arrayUtil = new ArrayUtil();

        // - получаем размер нашего массива
        int arraySize = userInterface.userArraySizeInput("Please enter array size ");

        // --- создаем новый пустой массив размера arraySize
        int[] ourWorkingArray = arrayCreateAndFill.createArray(arraySize);

        // ---- заполняем массив случайными числами заданного нами диапазона ----
        arrayCreateAndFill.fillArray(ourWorkingArray,true, 100);

        System.out.println(Arrays.toString(ourWorkingArray));

        int maxFromArray = arrayUtil.findMaxElement(ourWorkingArray);

        int minFromArray = arrayUtil.findMinElement(ourWorkingArray);

        //---- получение минимальногои максимального элементов -----

        System.out.println("Max element from our array is " + maxFromArray);

        System.out.println("Min element from our array is " + minFromArray);

        // ------ разбиение массива на две части -------

        int indexForSplit = userInterface.userArraySizeInput("Please enter index for split less then "+(ourWorkingArray.length-1));

        int[] newArrayPart1 = arrayUtil.createNewArrayFromOurArray(ourWorkingArray,0,indexForSplit);

        int[] newArrayPart2 = arrayUtil.createNewArrayFromOurArray(ourWorkingArray,indexForSplit+1, ourWorkingArray.length-1);

        System.out.println(Arrays.toString(newArrayPart1));
        System.out.println(Arrays.toString(newArrayPart2));

    }
}
