package Packages.Deafult;

public class EBike extends Bike {

    static void charge() {
        System.out.println("Ebike runs on charge as well as petrol");
    }

    public static void main(String[] args) {

        EBike e = new EBike();
        e.run();
        charge();

    }

}
