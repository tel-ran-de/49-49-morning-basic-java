package lessons.lesson14.lessoncode;

public class ArrayUtil {

    public int findMaxElement (int[] workingArray){

        int maxElement =workingArray[0];

        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i]>maxElement) {maxElement= workingArray[i];}
        }
        return maxElement;
    }

    public int findMinElement (int[] workingArray){

        int minElement =workingArray[0];

        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i] < minElement) {minElement = workingArray[i];}
        }
        return minElement;
    }

    public int[] createNewArrayFromOurArray(int[] workingArray, int indexStart, int indexEnd){

        int[] newArray = new int[indexEnd-indexStart+1];

        for (int i = 0; i < newArray.length; i++) {

            newArray[i] = workingArray[indexStart+i];
        }

        return newArray;
    }



}
