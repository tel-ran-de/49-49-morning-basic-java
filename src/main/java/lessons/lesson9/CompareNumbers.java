package lessons.lesson9;

import com.sun.source.tree.BreakTree;

public class CompareNumbers {

    double number1;

    double number2;


    public double compareLesser(){
        if (number1<number2) {return  number1;}
                else {return number2;}

    }

    public double compareMaximum(){
        if (number1>number2) {return  number1;}
        else {return number2;}

    }

    public boolean isEqual(){
        if (number1==number2) {return true;}
        else {return false;}
    }

    public void printInfo(String message, double compareResult, boolean check){
        System.out.println("--------");
        String outputMessage;
        if (check) {outputMessage = message  + compareResult;}
        else { outputMessage = message;}

        System.out.println(outputMessage);
    }

}
