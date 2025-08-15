import java.util.ArrayList;

public class May18_Arrays {

    static class Car {
        String name;
        String country;

        public Car(String name) {
            this.name = name;
        }

        public void drive() {
            System.out.println(this.name + " go vrum vrum");
        }

//        special method: automatically invoked when printing out the object
        @Override
        public String toString() {
            return "My car: " + this.name;
        }
    }

    public static void main(String[] args) {
//        1. static array
//            - length is fixed
//            - data-type
//
//
//        Primitive vs Wrapper types:
//        - Primitive: int, long, boolean, char, float, double, byte,...
//        - Wrapper: Integer, Long, Boolean, Character, Float, Double, Byte, String, Car,
//        (custom types, user-defined data type (UDT))

        int a = 1;
        Integer b = 2;

        System.out.println(a + b);

        Car mercedes = new Car("Mercedes AMG");
        mercedes.drive();
        System.out.println(mercedes);

        Car[] carCollection = new Car[3];
        ArrayList<Car> carCollection2 = new ArrayList<>();
    }
}
