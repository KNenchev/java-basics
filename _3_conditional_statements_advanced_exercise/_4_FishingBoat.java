package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _4_FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fisherman = Integer.parseInt(sc.nextLine());

        double rent = 0.0;

        switch (season){
            case "Spring":
                rent = 3000;
                if(fisherman % 2 == 0){
                    rent = rent - rent * 0.05;
                }
                break;
            case "Summer":
            case "Autumn":
                rent = 4200;
                if (season.equals("Summer") && fisherman % 2 == 0){
                    rent = rent - rent * 0.05;
                }
                break;
            case "Winter":
                rent = 2600;
                if(fisherman % 2 == 0){
                    rent = rent - rent * 0.05;
                }
                break;
        }
        if (fisherman <= 6){
            rent = rent - rent * 0.10;
        }else if (fisherman <= 11) {
            rent = rent - rent * 0.15;
        }else{
            rent = rent - rent * 0.25;
        }

        if (budget >= rent) {
            System.out.printf("Yes! You have %.2f leva left.", budget - rent);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", rent - budget);
        }
    }
}
