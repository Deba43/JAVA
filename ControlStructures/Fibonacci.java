package ControlStructures;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 7;
        int a = 0, b = 1, count = 2;
        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;

        }
        System.out.println("The Fibonacci upto " + n + " is: " + b);

    }

}
