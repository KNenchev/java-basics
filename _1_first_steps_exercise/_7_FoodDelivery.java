package _1_first_steps_exercise;

import java.util.Scanner;

public class _7_FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // Menus
//        int chickenMenu = Integer.parseInt(sc.nextLine());
//        int fishMenu = Integer.parseInt(sc.nextLine());
//        int veganMenu = Integer.parseInt(sc.nextLine());
//
//        // Calculations Menus
//         double chickenMenuPrice = chickenMenu * 10.35;
//         double fishMenuPrice = fishMenu * 12.4;
//         double veganMenuPrice = veganMenu* 8.15;
//
//         double finalMenuPrice = chickenMenuPrice + fishMenuPrice + veganMenuPrice;
//
//         // Desert + delivery
//        double desert = finalMenuPrice + (finalMenuPrice * 0.20) +2.5;
//
//        //Final Price
//        System.out.println(desert);


        // Menus + Price
        double chickenMenu = Double.parseDouble(sc.nextLine()) * 10.35;
        double fishMenu = Double.parseDouble(sc.nextLine()) * 12.4;
        double veganMenu = Double.parseDouble(sc.nextLine()) * 8.15;

        double finalMenuPrice = chickenMenu + fishMenu + veganMenu;

        // Desert + Delivery
        double desert = finalMenuPrice + (finalMenuPrice * 0.20) + 2.5;

        //Final Price
        System.out.println(desert);
    }
}
