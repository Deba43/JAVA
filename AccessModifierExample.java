class Parent {
    // Protected method
    protected void show() {
        System.out.println("Parent: Show method");
    }
}

class Child extends Parent {
    // Overriding with more access
    @Override
    public void show() {
        System.out.println("Child: Show method");
    }
}

// Compile-time error if we reduce access:
// private void show() { }
public class AccessModifierExample {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Calls the Child's show method
    }
}
