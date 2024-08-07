package _4_for_loop;

import java.util.Scanner;

public class _7_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        for(int i = 1; i <= n; i++){
            int nums = Integer.parseInt(sc.nextLine());
            sum += nums;
        }
        System.out.println(sum);
    }
}
