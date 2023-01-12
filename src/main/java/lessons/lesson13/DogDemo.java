package lessons.lesson13;

public class DogDemo {
    public static void main(String[] args) {

        Dog myDog= new Dog();
        DogUtil dogUtil = new DogUtil();

        System.out.println(myDog.name);

        dogUtil.changename(myDog,"Bobik");

        System.out.println(myDog.name);
    }
}
