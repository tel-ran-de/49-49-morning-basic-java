package lessons.lesson7;

public class IfElseContitionExample {
    public static void main(String[] args) {

        int x=100;
        int z;
        int a;

        if (x<100 && (x % 2 == 0 ))
        //вычисляем значение выражения (X<100) - результат или true или false
        //вычисляем значение выражения (x % 2 == 0) - результат или true или false
            // для этого вычисления сперва вычисляется остаток от деления x % 2
            // и далее сравнивается этот результат с 0 -> true или false

            // берем результат левой (первой) части && с результатом правой части нашего
            // выражения и получаем общий результат
            // true && true = true
            // false && true = false
            // false && false = false

        {
            int y = x*25;
             z=y*y;
             a=z*10;


        }
        else if (x>100)
        {
            int y = x/5;
             z=y*y;
             a=z+y;

        }
        else
        {
            int y=x*x;
             z=y*y;
             a=1000000;
        }

        System.out.println(z + " " +a);

    }
}
