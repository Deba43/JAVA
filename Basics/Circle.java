package Basics;

public class Circle {
    public static void main(String[] args) {
        double r = 4;
        double area = Math.PI * r * r;

        double pm = 2 * Math.PI * r;

        System.out.println("The perimeter of Circle with radius " + r + " is " + pm);

        System.out.println("The area of circle with radius " + r + " is " + area);

    }
}
