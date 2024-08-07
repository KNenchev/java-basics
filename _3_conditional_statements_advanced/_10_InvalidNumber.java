package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _10_InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if(num == 0 || num >= 100 && num <= 200){
            System.out.println();
        }else {
            System.out.println("invalid");
        }
    }
}
