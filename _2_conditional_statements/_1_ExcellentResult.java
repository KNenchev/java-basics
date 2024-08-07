package _2_conditional_statements;

import java.util.Scanner;

public class _1_ExcellentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if (num > 4){
            System.out.println("Excellent!");
        }
    }
}
