package _2_conditional_statements_exercise;

import java.util.Scanner;

public class _2_BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        double bonus = 0;

        if (num <= 100){
            bonus = 5;
        } else if (num > 101 && num < 1000) {
            bonus = num * 0.2;
        } else {
            bonus = num * 0.1;
        }

        if (num % 2 == 0){
            bonus = bonus + 1;
        }else if (num % 10 == 5){
            bonus = bonus +2;
        }
        System.out.println(bonus);
        System.out.println(num + bonus);
    }
}
