package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _2_SummerOutfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int degree = Integer.parseInt(sc.nextLine());
        String weather = sc.nextLine();

        String outfit;
        String shoes;

        if (weather.equals("Morning")){
            if(degree >= 10 && degree <= 18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if (degree > 18 && degree <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            }else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if (weather.equals("Afternoon")) {
            if(degree >= 10 && degree <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degree > 18 && degree <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }else{
            outfit = "Shirt";
            shoes = "Moccasins";
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degree, outfit, shoes);
    }
}
