package lessons.lesson7;

public class IfElseStringExample {
    public static void main(String[] args) {
        String stringForCondition = "TelRun";

        if (stringForCondition.equals("Java")){
            System.out.println("Java cool!");
        } else if (stringForCondition.equals("TelRan")) {
            System.out.println("Our school!");
        } else if (stringForCondition.equals("Anna")) {
            System.out.println("Our student!");
        } else if (stringForCondition.equals("Berlin")) {
            System.out.println("Our town!");
        } else {
            System.out.println("i don't understand!");
        }

    }
}
