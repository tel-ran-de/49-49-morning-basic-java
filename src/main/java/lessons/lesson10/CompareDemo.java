package lessons.lesson10;

/*
Task1:
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наибольшее из них.
Нельзя пользоваться классом Math, можно использовать только if else.

Task2:
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль наименьшее из них.

Task3:
Написать программу, которая запрашивает у пользователя
два целых числа и выводит на консоль:
- "Numbers are equals" - если числа равны
- "Numbers are different" - если числа не равны
 */
public class CompareDemo {
    public static void main(String[] args) {
        Compare compare =new Compare();

        System.out.println("----- Task 1 -------");
        int intValue1 = UserInput.inputInt("Please enter first integer number for detect maximum : ");
        int intValue2 = UserInput.inputInt("Please enter second integer number for detect maximum : ");

        System.out.println("Greatest number is - " + compare.greatestValue(intValue1,intValue2));


        System.out.println("----- Task 2 -------");

        intValue1 = UserInput.inputInt("Please enter first integer number for detect minimum: ");
        intValue2 = UserInput.inputInt("Please enter second integer number for detect minimum : ");

        System.out.println("Smallest number is - " + compare.smallestValue(intValue1,intValue2));

        System.out.println("----- Task 3 -------");

        intValue1 = UserInput.inputInt("Please enter first integer number for detect equals : ");
        intValue2 = UserInput.inputInt("Please enter second integer number for detect equals : ");

        if (compare.isEqual(intValue1,intValue2) == true){
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}
