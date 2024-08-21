package ControlStructures;

import java.util.Scanner;

public class Multiple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int m = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int n = sc.nextInt();

        if (m % n == 0)
            System.out.println(m + " is a multiple of " + n);
        else
            System.out.println(m + " is not a multiple of " + n);
        sc.close();
    }

}
