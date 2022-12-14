package lessons.lesson5;

public class StaticDemo {

    public static void main(String[] args) {
        StaticVarAndMethods firstExample = new StaticVarAndMethods();

        firstExample.normalVariable = "Hello";
        firstExample.staticVariable = "Hello my friend!";

        System.out.println("First example class");
        System.out.println("normalVariable: "+ firstExample.normalVariable);
        System.out.println("staticVariable: "+ firstExample.staticVariable);
        System.out.println("===============");

        //---------------------

        StaticVarAndMethods secondExample = new StaticVarAndMethods();

        secondExample.normalVariable = "Hello again!";
        secondExample.staticVariable = "Hello my friend again and again!";

        System.out.println("Second example class");
        System.out.println("normalVariable: "+ secondExample.normalVariable);
        System.out.println("staticVariable: "+ secondExample.staticVariable);
        System.out.println("===============");


        System.out.println("First example class");
        System.out.println("normalVariable: "+ firstExample.normalVariable);
        System.out.println("staticVariable: "+ firstExample.staticVariable);
        System.out.println("===============");


    }

}
