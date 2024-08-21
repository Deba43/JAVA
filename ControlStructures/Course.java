package ControlStructures;

import java.util.Scanner;

public class Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Mathematics:");
        int math = sc.nextInt();
        System.out.print("Enter marks in Physics:");
        int phy = sc.nextInt();
        System.out.print("Enter marks in Chemistry:");
        int chem = sc.nextInt();

        if ((math >= 60 && phy >= 50 && chem >= 40 && math + phy + chem >= 200) || math + phy >= 150) {
            System.out.println("Congrats you can admission to this Professional course");
        } else
            System.out.println("You are not eligible for this course");
    }
}
