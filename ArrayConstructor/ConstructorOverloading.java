package ArrayConstructor;

public class ConstructorOverloading {

    ConstructorOverloading() {
        System.out.println("I am 0 argument constructor");
    }

    ConstructorOverloading(int a) {
        System.out.println("I am parameterized constructor with constructor overloading");
        System.out.println("The value of a is:" + a);
    }

    public static void main(String[] args) {
        ConstructorOverloading co = new ConstructorOverloading();
        ConstructorOverloading co2 = new ConstructorOverloading(7);

    }

}
