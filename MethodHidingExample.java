class Parent {
    // Static method in the Parent class
    public static void show() {
        System.out.println("Parent: Static show method");
    }

    // Non-static method
    public void display() {
        System.out.println("Parent: Instance display method");
    }
}

class Child extends Parent {
    // Static method hiding the Parent's static method
    public static void show() {
        System.out.println("Child: Static show method");
    }

    // Overriding instance method
    @Override
    public void display() {
        System.out.println("Child: Instance display method");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        // Reference of Parent type, object of Child
        Parent obj = new Child();

        // Static method: Resolved at compile-time based on reference type
        obj.show(); // Outputs: Parent: Static show method

        // Instance method: Resolved at runtime based on the object
        obj.display(); // Outputs: Child: Instance display method
    }
}
