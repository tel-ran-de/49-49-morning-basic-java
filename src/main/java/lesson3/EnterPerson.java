package lesson3;

import java.sql.SQLOutput;

public class EnterPerson {

    public static void main(String[] args) {

        int a = 10;
        int b;

        //System.out.println(a);

        Human person1 = new Human();

        person1.name = "Ivan";
        person1.age = 25;
        person1.town = "Berlin";

        System.out.println(person1.name);

        System.out.println(person1);

        Human person2 = new Human();
        person2.name = "Ruslan";
        person2.age = 30;
        person2.town = "Riga";

        System.out.println(person2);

        person1.age=26;
        person1.town="London";


        person1.greeting();
        person2.greeting();

        person2 = person1;
        System.out.println(person1);
        System.out.println(person2);

        person1.greeting();
        person2.greeting();







    }
}
