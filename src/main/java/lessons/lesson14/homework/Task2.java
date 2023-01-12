package lessons.lesson14.homework;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int [] workinkArray = new int[4];

            for (int i = 0; i < workinkArray.length; i++) {
            workinkArray[i] = (int)(Math.random()*90)+10;
        }
        System.out.println(Arrays.toString(workinkArray));
 
        boolean flag = true;
        for (int i = 1; i < workinkArray.length; i++) {
            if(workinkArray[i]<=workinkArray[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }

}
