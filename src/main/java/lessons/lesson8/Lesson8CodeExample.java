package lessons.lesson8;

public class Lesson8CodeExample {
    /*
    Написать программу, которая запрашивает у пользователя
    три целых числа и выводит на консоль наибольшее из них.

    PS: перед решением этой задачи распишите на бумаге
    или в коментарии все возможные варианты (комбинации).
    Это поможет вам правильно написать программу!
    Нельзя пользоваться классом Math.

     */

    public static void main(String[] args) {
        ThreeNumbersCompare threeNumbersCompare = new ThreeNumbersCompare();

        double parametr1 = threeNumbersCompare.userNumberInput("Please enter your first number -");
        double parametr2 = threeNumbersCompare.userNumberInput("Please enter your second number -");
        double parametr3 = threeNumbersCompare.userNumberInput("Please enter your third number -");

        double chechResult = threeNumbersCompare.compare(parametr1,parametr2,parametr3);

        threeNumbersCompare.printMsg("Maximum from your three numbers is "+chechResult);

    }

}
