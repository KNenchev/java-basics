package _1_first_steps_exercise;

import java.util.Scanner;

public class _3_DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input info
        double depositSum = Double.parseDouble(sc.nextLine()) ;
        int monthsOfDeposit = Integer.parseInt(sc.nextLine());
        double annualPercent = Double.parseDouble(sc.nextLine());

        // Calculations
        double depositSumPlusMonths = depositSum * annualPercent/ 100;
        double interestForMonth = depositSumPlusMonths / 12;

        //  Final Total
        double total = depositSum + (monthsOfDeposit * interestForMonth);

        System.out.println(total);

    }
}
