package _2_conditional_statements_exercise;

import java.util.Scanner;

public class _4_ToyShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(sc.nextLine());
        int puzzle = Integer.parseInt(sc.nextLine());
        int doll = Integer.parseInt(sc.nextLine());
        int bear = Integer.parseInt(sc.nextLine());
        int minion = Integer.parseInt(sc.nextLine());
        int truck = Integer.parseInt(sc.nextLine());

        double totalPrice = puzzle * 2.6 + doll * 3 + bear * 4.1 + minion * 8.2 + truck * 2;
        double totalToys = puzzle + doll + bear + minion + truck;

        if(totalToys >= 50){
            totalPrice = totalPrice * 0.75;
        }

        totalPrice = totalPrice * 0.9;

        if(holidayPrice <= totalPrice){
            System.out.printf("Yes! %.2f lv left.", totalPrice - holidayPrice);
        }else{
            System.out.printf("Not enough money! %.2f lv needed.", holidayPrice - totalPrice);
        }
    }
}
