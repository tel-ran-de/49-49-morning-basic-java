package lessons.lesson11;

public class IfElseExample {
    public static void main(String[] args) {

       int buildingSize = 15;

       int liftUp = 10;

       int liftDown = 9;

       int currentFlow= 0;

       int dayCounter=0;


       while (currentFlow<buildingSize) {
           dayCounter++;
           currentFlow = currentFlow +liftUp;
           if (currentFlow>=buildingSize) {break;}
           currentFlow = currentFlow- liftDown;
       }

        System.out.println("You need " + dayCounter + " days");

    }
}
