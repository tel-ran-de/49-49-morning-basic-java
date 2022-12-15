package lessons.lesson6.example2;

public class ConditionalOperators {

    public static void main(String[] args) {

        int x = 150;

            /* x > 0 - результат true или  false в нашем случае - true
               x <=100 - результат true или  false в нашем случае - false
               true && false  => 150 > 0  но не верно что 150 <=100

               результат && :  true только если оба выражения будут  true

             */
        // (true && false) = false
        if (x > 0 && x <= 100) {
            System.out.println("x is between 0 and 100");
            //(true && true)
        } else if (x > 100 && x <= 200) {
            System.out.println("x is between 100 and 200");
        }


        boolean rain = true;
        boolean cloud = true;
        boolean sun  = true;


        if (sun && !rain) {
            System.out.println("Идем гулять с зонтом");
        } else {
            System.out.println("Идем гулять без зонта");
        }
    }
}
