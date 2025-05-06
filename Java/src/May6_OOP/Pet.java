package May6_OOP;

public class Pet {
//    attributes / properties
    private String name;
    private String breed;


    // constructors
    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

//    methods
    public void eat(String food) {
        System.out.println(name + " eats " + food);
    }

    public void play() {
        System.out.println(name + " is playing!");
    }


    // getters

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }
}
