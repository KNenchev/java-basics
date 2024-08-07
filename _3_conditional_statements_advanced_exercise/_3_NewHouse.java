package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _3_NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String flowers = sc.nextLine();
        int numbersOfFlowers = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());

        double price = 0;

        if (flowers.equals("Roses")){
            price = 5;
            if (numbersOfFlowers > 80){
                price = price - price * 0.10;
            }
        }else if (flowers.equals("Dahlias")) {
            price = 3.80;
            if(numbersOfFlowers > 90){
                price = price - price * 0.15;
            }
        }else if (flowers.equals("Tulips")) {
            price = 2.80;
            if(numbersOfFlowers > 80){
                price = price - price * 0.15;
            }
        }else if (flowers.equals("Narcissus")) {
            price = 3;
            if(numbersOfFlowers < 120){
                price = price * 1.15;
            }
        }else if (flowers.equals("Gladiolus")) {
            price = 2.50;
            if(numbersOfFlowers < 80){
                price = price * 1.20;
            }
        }
        double sum = numbersOfFlowers * price;

        if (budget >= sum){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numbersOfFlowers, flowers, budget - sum);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", sum - budget);
        }
    }
}
