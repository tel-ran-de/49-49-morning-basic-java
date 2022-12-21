package lessons.lesson9;


public class LoopForExample2 {
    public static void main(String[] args) {

        String workString = "For loop example.";

        for (int i = 0; i < workString.length(); i++) {

            char simbolFromOurString = workString.charAt(i);
            System.out.println(i + " simbol from our string -" +simbolFromOurString);

        }

        System.out.println("-------");

        int counter=0;

        while (counter<workString.length()){
            char simbolFromOurString = workString.charAt(counter);
            System.out.println(counter + " simbol from our string -" +simbolFromOurString);
            counter++;

        }


    }
}
