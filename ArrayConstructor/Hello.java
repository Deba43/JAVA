package ArrayConstructor;

abstract class Hello {
    // The greet() method needs a return type, void in this case
    static void greet() {
        System.out.println("hsde");
    }

    // Constructor for the abstract class

}

class World extends Hello {
    // Constructor for the World class

    static void greet() {
        System.out.println("abc");
    }

    public static void main(String[] args) {
        World.greet();
        Hello.greet(); // Creates an instance of World
        // w.greet(); // Calls the overridden greet() method
    }
}
