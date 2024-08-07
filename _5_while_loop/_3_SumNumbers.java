package _5_while_loop;

import java.util.Scanner;

public class _3_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int sum = 0;

        while (sum < n){
            int nums = Integer.parseInt(sc.nextLine());
            sum += nums;
        }
        System.out.println(sum);
    }
}
