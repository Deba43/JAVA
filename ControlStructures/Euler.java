package ControlStructures;

public class Euler {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));

    }

    static double sum(int n) {
        double sum = 0;
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact *= i;
            sum += 1.0 / fact;
        }
        return sum;
    }

}
