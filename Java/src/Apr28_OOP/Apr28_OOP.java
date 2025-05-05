package Apr28_OOP;

public class Apr28_OOP {
//    Object-Oriented Programming
//    Class -> objects


//    4 pillars of OOP:
//        - Inheritance: tinh thua ke
//        - Encapsulation: tinh dong goi
//        - Abstraction: tinh truu tuong
//        - Polymorphism: tinh da hinh



    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
//        vehicle.wheels = 5;
        vehicle.drive();

        Vehicle bigVehicle = new Vehicle(12);
        bigVehicle.drive();

        Vehicle myVehicle = new Vehicle("My Vehicle", 8);
        myVehicle.drive();

//        System.out.println(vehicle.wheels);
    }
}
