package Apr28_OOP;

class Vehicle {
    // class attributes
    private int wheels = 4; // encapsulation
    private String name = "Vehicle";

    // constructors:
    // - special methods to build up the object
    // - no return type, method name is the same as class name
    // - a default empty constructor is created for you
    public Vehicle() {}

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }

    // methods
    public void drive() {
        System.out.println(this.name + " drives on " + wheels + " wheels");
    }

    // getters
    public int getWheels() {
        return this.wheels;
    }
}