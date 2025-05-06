package May6_OOP;

public class Dog extends Pet {

    public Dog() {
//        super here refers to the parent's constructor
        super("Su the dog", "Chihuahua");
    }

    public void play() {
//        this.getBreed(): Dog.getBreed()
//        super.getBreed(): Pet.getBreed()
        System.out.println(this.getName() + " plays with a ball");
//        super.play();
        System.out.println("After playing, the " + this.getBreed() + " eats:");
        super.eat("bones");
    }

    public void setName(String name) {
//        super here refers to the parent class
        super.setName(name);
    }
}
