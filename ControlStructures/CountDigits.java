package ControlStructures;

public class CountDigits {
    public static void main(String[] args) {
        int num = 12345;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            count++;

        }
        System.out.println(count);
    }
}
