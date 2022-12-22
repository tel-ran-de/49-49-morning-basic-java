package lessons.lesson10;

public class CircleDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(10);

        System.out.println(circle.calculateArea());

        circle.radius=5;

        System.out.println(circle.calculateArea());


    }
}
