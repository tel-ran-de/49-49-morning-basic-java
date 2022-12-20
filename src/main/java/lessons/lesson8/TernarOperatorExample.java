package lessons.lesson8;

public class TernarOperatorExample {
    public static void main(String[] args) {

        System.out.println(absolute(10));
        System.out.println(absolute(-10));



    }

    public static int absolute (int number){
        if (number>=0){
            return number;
        } else {
            return -number;
        }
    }

    public static int absolute2 (int number) {
        // <predicate> ? <expression on true> : <expression on false>
        int result = number >=0 ? number : -number;
        return  result;
    }

}
