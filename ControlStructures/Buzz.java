package ControlStructures;

import java.util.Scanner;

public class Buzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println(num + " is a BUZZ number");
        } else
            System.out.println(num + " is not a BUZZ number");

        sc.close();
    }

}