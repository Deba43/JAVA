package Packages.Deafult2;

import Packages.Deafult.*;

public class Car {

    static void Tyre() {
        System.out.println("Car has 4 tyres");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();

        Tyre();

    }

}
