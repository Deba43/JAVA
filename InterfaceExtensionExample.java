// Parent Interface 1
interface Vehicle {
    void start();
}

// Parent Interface 2
interface Engine {
    void fuelType();
}

// Child Interface
interface Car extends Vehicle, Engine {
    void drive();
}

// Implementing Class
class Sedan implements Car {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type: Petrol");
    }

    @Override
    public void drive() {
        System.out.println("Driving the car...");
    }
}

// Main Class
public class InterfaceExtensionExample {
    public static void main(String[] args) {
        Car myCar = new Sedan();
        myCar.start();
        myCar.fuelType();
        myCar.drive();
    }
}
