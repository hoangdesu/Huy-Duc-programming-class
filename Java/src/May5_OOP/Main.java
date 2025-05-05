package May5_OOP;

public class Main {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        myPet.name = "My pet";
        System.out.println(myPet.name);
        myPet.eat("rice");
        System.out.println(myPet.breed);


//        Inherited classes
        Cat myCat = new Cat();
        myCat.name = "Tom the cat";
        myCat.eat("fish");
        myCat.play();
        myCat.play("wool");
        System.out.println(myCat.breed);


        Dog myDog = new Dog();
        myDog.name = "Su the dog";
        myDog.eat("sausage");
        myDog.play();
        System.out.println(myDog.breed);


        Cat yourCat = new Cat();
        yourCat.name = "Jerry the cat";
        System.out.println(yourCat.breed);

//        TODO:
//        - constructors + super()
//        - interface + Abstraction + implements
    }
}
