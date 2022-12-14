package lessons.lesson4;

public class WorkWithString {
    public static void main(String[] args) {


        String text = "Это текст для проверки работы методов типа String";

        String text1="";



        System.out.println(text);

        System.out.println(text.length());
        System.out.println(text1.length());

        System.out.println(text.isEmpty());
        System.out.println(text1.isEmpty());


        char simbol = text.charAt(0);

        System.out.println(text.charAt(0));
        System.out.println(text.charAt(10));
        System.out.println(text.charAt(14));
        System.out.println(text.charAt(48));


        String sunText = text.substring(0,10);

        System.out.println(sunText + " " + sunText.length());

        System.out.println(text.substring(45));

    }
}
