package lessons.lesson5.staticDemo;

public class PersonDemo {
    public static void main(String[] args) {
        Person personOlga = new Person();
        personOlga.name = "Olga";
       // personOlga.town = "Dnepropetrovsk";


        Person personPetr = new Person();
        personPetr.name = "Petr";
      //  personPetr.town = "Dnepropetrovsk";




        System.out.println("======== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);



        System.out.println("======== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


        personPetr.town = "Dnepr";

        System.out.println("======== Olga =====");
        System.out.println(personOlga.name);
        System.out.println(personOlga.town);

        System.out.println("======== Petr =====");
        System.out.println(personPetr.name);
        System.out.println(personPetr.town);


    }
}
