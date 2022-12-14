package lessons.lesson4;



import java.util.Scanner;

public class DogDemo {

    public static void main(String[] args) {

        Dog myDog = new Dog("Lessy", "Kolli", 3);


        myDog.voice("Gav! Gav! Gav!");

        myDog.age= myDog.age+1;

        System.out.println(myDog);


        Dog myDog2 = new Dog ("Tuzik",5 );

        Dog myDog3 = new Dog("Bobik","Taksa");

        System.out.println(myDog2);

        System.out.println(myDog3);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Input dog name -");

        String dogName = scanner.nextLine();

        System.out.println("Input dog's brred -");

        String dogBreed = scanner.nextLine();

        System.out.println("Input dog's age -");

        int dogAge = scanner.nextInt();

        Dog myDog5 =new Dog(dogName,dogBreed,dogAge);

        System.out.println(myDog5);





    }
}
