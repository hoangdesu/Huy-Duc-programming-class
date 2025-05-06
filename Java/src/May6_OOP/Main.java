package May6_OOP;

public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet("my cute pet", "Rabbit");
//        myPet.name = "My pet";
        System.out.println(myPet.getName());
        myPet.eat("rice");
        System.out.println(myPet.getBreed());


//        Inherited classes
        Cat myCat = new Cat("Tom the cat");
//        myCat.name = "Tom the cat";
        myCat.eat("fish");
        myCat.play();
        myCat.play("wool");
        System.out.println(myCat.getBreed());


        Dog myDog = new Dog();
//        myDog.name = "Su the dog";
        myDog.eat("sausage");
        myDog.play();
        System.out.println(myDog.getBreed());

        myDog.setName("Spike the dog");
        System.out.println("dog new name: " + myDog.getName());
//
//
//        Cat yourCat = new Cat();
////        yourCat.name = "Jerry the cat";
//        System.out.println(yourCat.breed);

//        TODO:
//        - abstract class vs interface + Abstraction + implements
    }
}
