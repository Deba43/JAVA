package ControlStructures;

public class Prime {
    public static void main(String[] args) {
        // prime is a non static method so we have to create object as
        // static method can't access a nonstatic method
        // to direct access prime should be static
        Prime p = new Prime();
        p.prime(35);
    }

    public void prime(int n) {
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }

        System.out.println(n + " is a prime number");
    }

}
