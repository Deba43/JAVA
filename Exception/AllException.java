/*
1. try
Definition: A block of code where exceptions might occur.
Purpose: Encloses code that might throw an exception to prevent the program from terminating abruptly.
Usage: Always followed by either a catch or a finally block (or both)

2. catch
Definition: A block of code used to handle exceptions thrown in the associated try block.
Purpose: Provides specific actions to perform when an exception occurs.
Usage: Can have multiple catch blocks to handle different types of exceptions.

3. finally
Definition: A block of code that always executes after the try (and optional catch) block.
Purpose: Used for cleanup operations such as closing files, releasing resources, or resetting variables.
Usage: Executes whether or not an exception was thrown or handled

4. throw
Definition: Used to explicitly throw an exception in the program.
Purpose: Signals the occurrence of an exception, often with a specific message.
Usage: Used inside a method body or constructor.

5. throws
Definition: Used in a method signature to declare that the method might throw one or more exceptions.
Purpose: Alerts the caller of the method to handle or propagate the specified exceptions.
Usage: Declares checked exceptions that the method does not handle.


 */

package Exception;

import java.io.*;

public class AllException {

    // Method that declares it might throw an exception
    public static void getNumber(int a) throws IOException {
        if (a < 0) {
            // Explicitly throwing an exception
            throw new IOException("Please provide a Positive Integer number");
        }
        System.out.println("The value of a is : " + a);
    }

    public static void main(String[] args) {
        try {
            // Trying to read a file
            getNumber(-6);
        } catch (IOException e) {
            // Handling the thrown exception
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            // Code in this block always executes
            System.out.println("Closing resources (if any).");
        }
    }
}
