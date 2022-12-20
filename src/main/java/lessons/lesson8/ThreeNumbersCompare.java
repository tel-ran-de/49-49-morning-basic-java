package lessons.lesson8;

import java.util.Scanner;

public class ThreeNumbersCompare {
    public double userNumberInput (String message){
        double userInput =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        userInput = scanner.nextDouble();
        return  userInput;
    }

    public void printMsg(String message){
        System.out.println("-------------");
        System.out.println(message);
    }

    public double compare(double parametr1, double parametr2, double parametr3){
        double compareResult=0;

        if ((parametr1>=parametr2)&&(parametr1>=parametr3)){ // p1> p2 p1<p3 ==> p3> p1 > p2
            compareResult=parametr1;
        }

        if ((parametr2>=parametr1)&&(parametr2>=parametr3)){
            compareResult=parametr2;
        }

        if ((parametr3>=parametr1)&&(parametr3>=parametr2)){
            compareResult=parametr3;
        }


        return compareResult;
    }
}
