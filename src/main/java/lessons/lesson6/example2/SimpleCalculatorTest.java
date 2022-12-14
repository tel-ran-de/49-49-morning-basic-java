package lessons.lesson6.example2;

public class SimpleCalculatorTest {

    public static void main(String[] args) {
        SimpleCalculatorTest testRunner = new SimpleCalculatorTest();
        testRunner.testMaxFunction1();
        testRunner.testMaxFunction2();
        testRunner.testSumFunction1();
    }

    public void testMaxFunction1() {
        int a = 10;
        int b = 20;
        int expectedResult = 20;
        SimpleCalculator subject = new SimpleCalculator();
        int actualResult = subject.max(a, b);

        check(expectedResult, actualResult, "Test Max Function 1");
    }

    public void testMaxFunction2() {
        int a = -10;
        int b = -20;
        int expectedResult = -10;
        SimpleCalculator subject = new SimpleCalculator();
        int actualResult = subject.max(a, b);

        check(expectedResult, actualResult, "Test Max Function 2");
    }

    public void testSumFunction1() {
        int a = 5;
        int b = 2;
        int expectedResult = 7;
        SimpleCalculator subject = new SimpleCalculator();
        int actualResult = subject.sum(a, b);

        check(expectedResult, actualResult, "Test Sum Function 1");
    }

    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " passed!");
        } else {
            System.out.println(testName + " failed!");
            System.out.println("Expected:" + expectedResult + " but actual is: " + actualResult);
        }
    }

}
