package May5_OOP;

public class Pet {
//    attributes / properties
    public String name;
    public String breed;

//    methods
    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }

    public void play() {
        System.out.println(name + " is playing!");
    }
}
