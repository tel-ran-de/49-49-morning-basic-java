package lessons.lesson10;

public class DogDemo {
    public static void main(String[] args) {

        Dog dog = new Dog("Tuzik",3);
        //dog.setName("Tuzik");
        dog.breed= "huski";


        dog.sleep();

        System.out.println(dog.getName() + "  " + dog.age + "  " + dog.breed + "  " + dog.hungry);

        Dog dog2 = new Dog("Bobik", 2);

        System.out.println(dog2.getName() + "  " + dog2.age + "  " + dog2.breed + "  " + dog2.hungry);




    }
}
