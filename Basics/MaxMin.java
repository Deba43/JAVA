package Basics;

public class MaxMin {
    public static void main(String[] args) {
        int a = 67;
        int b = 7;
        int c = 90;

        int max, min;

        // Find maximum
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

        // Find minimum
        if (a < b && a < c) {
            min = a;
        } else if (b < a && b < c) {
            min = b;
        } else {
            min = c;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

}
