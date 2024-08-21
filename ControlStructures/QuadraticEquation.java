package ControlStructures;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Write the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Write the value of c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("'a' cannot be zero in a quadratic equation.");
            return;
        }

        double firstRoot, secondRoot;

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            firstRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            secondRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("First root: " + firstRoot);
            System.out.println("Second root: " + secondRoot);
        } else if (discriminant == 0) {
            firstRoot = secondRoot = -b / (2 * a);
            System.out.println("First root: " + firstRoot);
            System.out.println("Second root: " + secondRoot);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);

            System.out.printf("First Root = %.2f + %.2fi\n", real, imaginary);
            System.out.printf("Second Root = %.2f - %.2fi\n", real, imaginary);
        }
        sc.close();
    }

}
