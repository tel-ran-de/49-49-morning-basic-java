package lessons.lesson5.workWithString;

public class WorkWithString2 {
    public static void main(String[] args) {

        String text = "     Это текст для метод проверки работы методов типа String      ";

        StringMethodsTest(text);

    }


    public static void StringMethodsTest(String text){

        System.out.println("Working text is - "+text);

        String testString1 = "рабо";

        boolean resultContains = text.contains(testString1);

        System.out.println(resultContains);

        System.out.println(text.contains("Pert"));

        String textUpperCase = text.toUpperCase();

        System.out.println(textUpperCase);

        System.out.println(text.toLowerCase());

        System.out.println(text.trim());

        int catAge = 7;
        String catAgeStringType = String.valueOf(catAge);

        String catAgeStringType2 = ""+catAge;


        System.out.println(catAgeStringType2);


        String inputFromKeyboard="125";

        Integer resultInt = Integer.parseInt(inputFromKeyboard);
        Double resultDouble = Double.parseDouble("12.65");


        System.out.println(resultInt+resultDouble);

        System.out.println(text.indexOf("метод"));

        System.out.println(text.lastIndexOf("метод"));

        /*
        1) посмотреть в интернете решение как найти индексы трех разных вхождений подстроки
        2) замена символов (replace())
         */



    }
}
