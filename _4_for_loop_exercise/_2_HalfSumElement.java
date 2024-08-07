package _4_for_loop_exercise;

import java.util.Scanner;

public class _2_HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int nums = Integer.parseInt(sc.nextLine());

            maxValue = Math.max(maxValue, nums);

            sum += nums;

        }
        int sumWithoutMaxValue = sum - maxValue;

        if (maxValue == sumWithoutMaxValue){
            System.out.println("Yes");
            System.out.println("Sum = " + maxValue);
        }else {
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(maxValue - sumWithoutMaxValue));
        }
    }
}
