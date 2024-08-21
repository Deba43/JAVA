package ControlStructures;

import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int a = sc.nextInt();
        double[] num = new double[a];

        System.out.print("Enter the elements:");
        for (int i = 0; i < a; i++) {
            num[i] = sc.nextDouble();
        }
        Arrays.sort(num);

        double median;
        if (a % 2 == 1)
            median = num[a / 2];
        else
            median = (num[(a / 2) - 1] + num[a / 2]) / 2.0;
        System.out.println("The median is: " + median);
        sc.close();
    }

}
