package _2_conditional_statements_exercise;

import java.util.Scanner;

public class _5_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int statists = Integer.parseInt(sc.nextLine());
        double clothes = Double.parseDouble(sc.nextLine());

        double decor = budget * 0.1;

        if(statists > 150){
            clothes = clothes * 0.9;
        }
        double clothesPrice = statists * clothes;

        double total = decor + clothesPrice;

        if(total > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", total - budget);
        }else{
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - total);
        }
    }
}
