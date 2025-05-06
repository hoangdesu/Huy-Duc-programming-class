package May6_OOP;

//child class, inheriting from parent class Pet
public class Cat extends Pet {
//    constructor for the Cat
    public Cat(String name) {
//        special keyword to call the parent class's constructor
        super(name, "Cat");
    }

    public void play(String toy) {
        System.out.println(this.getName() + " is playing with " + toy);
    }
}
