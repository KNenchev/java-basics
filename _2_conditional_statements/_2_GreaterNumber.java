package _2_conditional_statements;

import java.util.Scanner;

public class _2_GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        System.out.println(Math.max(num1, num2));
    }
}
