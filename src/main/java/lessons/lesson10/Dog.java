package lessons.lesson10;

public class Dog {

    private String name;

    int age;

    String breed;

    boolean hungry;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public void sleep(){
        System.out.println("Sleeeep! Hrrrrrrrr!");
    }


}
