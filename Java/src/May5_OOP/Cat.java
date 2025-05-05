package May5_OOP;

//child class, inheriting from parent class Pet
public class Cat extends Pet {
    // nothing!!
    public String breed = "Cat";

    public void play(String toy) {
        System.out.println(name + " is playing with " + toy);
    }
}
