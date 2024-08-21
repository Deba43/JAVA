package ControlStructures;

import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double result = Math.exp(number);

        System.out.println("The exponential of " + number + " is: " + result);
        scanner.close();
    }
}
