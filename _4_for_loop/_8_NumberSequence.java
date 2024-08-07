package _4_for_loop;

import java.util.Scanner;

public class _8_NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int nums = Integer.parseInt(sc.nextLine());

            minValue = Math.min(minValue, nums);
            maxValue = Math.max(maxValue, nums);
        }
        System.out.println("Max number: " + maxValue);
        System.out.println("Min number: " + minValue);
    }
}
