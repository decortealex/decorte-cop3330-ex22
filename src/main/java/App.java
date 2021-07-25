/*
 * UCF COP3330 SUMMER 2021 ASSIGNMENT 1 SOLUTION
 * COPYRIGHT 2021 ALEXANDER DE CORTE
 */

import java.util.Scanner;

public class App {
    public static double findMaxDouble(double[] arr) {
        double max = Double.MIN_VALUE;

        for (double v : arr) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }

    public static boolean areElementsIdentical(double[] arr) {
        boolean isIdentical = true;
        for(int i = 0; i < arr.length - 2; i++) {
            if (arr[i] != arr[i + 1]) {
                isIdentical = false;
                break;
            }
        }

        return isIdentical;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] nums = new double[3];

        System.out.print("Enter the first number. ");
        nums[0] = Double.parseDouble(in.nextLine());
        System.out.print("Enter the second number: ");
        nums[1] = Double.parseDouble(in.nextLine());
        System.out.print("Enter the third number: ");
        nums[2] = Double.parseDouble(in.nextLine());

        if(!areElementsIdentical(nums)) {
            double max = findMaxDouble(nums);
            System.out.printf("The largest number is %.1f\n", max);
        }
        else {
            System.out.print("Not all numbers are different");
        }
    }
}
