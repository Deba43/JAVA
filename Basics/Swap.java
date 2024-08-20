package Basics;

public class Swap {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        System.out.println("The value of a and b before swapping is " + a + " " + b);

        Safe(a, b);
    }

    private static void Safe(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a and b after swapping is " + a + " " + b);
    }

}
