package lessons.lesson8;

public class TernarOperatorExample2 {
    /*
    Реализовать метод, который принимает число  и проверяет его
    Если число целое , то возвращает квадрат этого числа
    иначе - возвращает 0
     */
    public static void main(String[] args) {

        System.out.println(checkNumber(20.555));

        System.out.println(checkNumber(10.0));

        System.out.println(checkNumber2(20.555));

        System.out.println(checkNumber2(10.0));

    }

    public static int checkNumber(double number) {

        int checkMainPart = (int) (number); //результат в первом примере - 20

        double ostatok = number - checkMainPart; // остаток 20.555 - 20 = 0,555

        System.out.println("ostatok = "+ostatok);

        if (ostatok == 0) {
            return checkMainPart * checkMainPart;
        } else {
            return 0;
        }
    }

    public static int checkNumber2(double number) {

        int checkMainPart = (int) (number);

        double ostatok = number - checkMainPart;

        int resultForReturn = ostatok == 0 ? checkMainPart * checkMainPart : 0;

        return resultForReturn;

        // return ostatok==0 ? checkMainPart*checkMainPart : 0;
    }

}
