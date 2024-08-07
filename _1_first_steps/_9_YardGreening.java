package _1_first_steps;

import java.util.Scanner;

public class _9_YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double squareMeter = Double.parseDouble(sc.nextLine());

        double total =  squareMeter * 7.61;
        double discount = total * 0.18;
        double totalAfterDiscount = total - discount;

        System.out.println("The final price is: " + totalAfterDiscount + " lv.");
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
