package _4_for_loop;

import java.util.Scanner;

public class _10_OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++) {
            int nums = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0){
                even += nums;
            }else {
                odd += nums;
            }
        }
        if(even == odd){
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        }else{
            System.out.println("No");
            System.out.println("Diff = " + Math.abs(even - odd));
        }
    }
}
