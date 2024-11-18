package Exception;

public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above.");
        } else {
            System.out.println("Welcome, you are eligible.");
        }
    }

    public static void main(String[] args) {
        checkAge(16); // This will throw an exception
        System.out.println("Program continues..."); // This line won't be executed
    }
}
