package _1_first_steps;

import java.util.Scanner;

public class _4_InchesToCentimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double inch = sc.nextDouble();
        double centimeter = 2.54;
        double result = inch * centimeter;
        System.out.println(result);
    }
}
