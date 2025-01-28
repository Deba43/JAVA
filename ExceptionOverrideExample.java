import java.io.*;

class Parent {
    // Overridden method with checked exception
    public void display() throws IOException {
        System.out.println("Parent: Display method");
    }
}

class Child extends Parent {
    // Overriding method with the same exception
    @Override
    public void display() throws FileNotFoundException { // FileNotFoundException is a subclass of IOException
        System.out.println("Child: Display method");
    }
}

// Compile-time error if we throw a broader exception:
// public void display() throws Exception { }
public class ExceptionOverrideExample {
    public static void main(String[] args) throws IOException {
        Parent obj = new Child();
        obj.display();
    }
}
