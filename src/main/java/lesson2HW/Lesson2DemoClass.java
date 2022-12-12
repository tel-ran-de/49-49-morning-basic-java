package lesson2HW;

import lesson2HW.entity.Cat;
import lesson2HW.entity.Dog;

public class Lesson2DemoClass {

    public static void main(String[] args) {

        // int x = 25;

        Dog myDog = new Dog();
        myDog.age=2;
        myDog.name="Tuzik";
        myDog.color= "grey";

        Dog dog2 = new Dog();
        dog2.name= "Bobik";
        dog2.age=4;
        dog2.color="mix";

        Cat cat = new Cat();



        myDog.voiceDog("Gav!");

        dog2.voiceDog("Gav! Gav! Gav!");

        cat.voiceCat();
        cat.voiceCat();





    }
}
