package _2_conditional_statements_exercise;

import java.util.Scanner;

public class _7_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    • Видеокарта – 250 лв./бр.
//    • Процесор – 35% от цената на закупените видеокарти/бр.
//    • Рам памет – 10% от цената на закупените видеокарти/бр.

        double budget = Double.parseDouble(sc.nextLine());
        int gpu = Integer.parseInt(sc.nextLine());
        int cpu = Integer.parseInt(sc.nextLine());
        int ram = Integer.parseInt(sc.nextLine());

        double gpuPrice = gpu * 250;
        double cpuPrice = cpu * gpuPrice * 0.35;
        double ramPrice = ram * gpuPrice * 0.10;

        double totalPrice = gpuPrice + cpuPrice + ramPrice;

        if (gpu > cpu){
            totalPrice = totalPrice * 0.85;
        }

         if (budget >= totalPrice){
             System.out.printf("You have %.2f leva left!", budget - totalPrice);
         }else {
             System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
         }
    }
}
