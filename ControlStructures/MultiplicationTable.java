package ControlStructures;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int a = s.nextInt();
        System.out.println("The multiplication table of " + a + " is:");
        for (int i = 1; i < 11; i++) {

            System.out.println(a + "*" + i + " = " + a * i);
        }
        s.close();

    }

}
