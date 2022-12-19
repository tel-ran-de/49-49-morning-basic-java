package lessons.lesson7;

public class QuickMathDemo {
    public static void main(String[] args) {
        QuickMath quickMath = new QuickMath();
        int x=5;
        int y = 3;

        int result = quickMath.sum(x,y) * quickMath.minus(x,y);
        int resultAlternative = quickMath.result(x,y);

        System.out.println(result + "  " + resultAlternative);
    }
}
