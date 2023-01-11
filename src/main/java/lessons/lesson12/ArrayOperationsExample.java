package lessons.lesson12;

public class ArrayOperationsExample {


    public int sumOfArrayElement (int [] workingArray){
        int sum=0;

        for (int i = 0; i < workingArray.length; i++) {
            sum = sum + workingArray[i];
        }

        return sum;
    }

    public int minOfArrayElement (int [] workingArray){
        int min=workingArray[0];

        for (int i = 0; i < workingArray.length; i++) {
            if (workingArray[i]<min){
                min = workingArray[i];
            }
        }

        return min;
    }

    public int maxOfArrayElement (int [] workingArray){
        int max=workingArray[0];

        for (int i = 0; i < workingArray.length; i++) {
           if (workingArray[i]>max) {
               max = workingArray[i];
           }
        }

        return max;
    }
}
