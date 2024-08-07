package _1_first_steps_exercise;

import java.util.Scanner;

public class _8_BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]
        int yearlyTax = Integer.parseInt(sc.nextLine());

//    • Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        double sneakers = yearlyTax * 0.60; // or yearlyTax - yearlyTax * 0.40;
//    • Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        double outfit = sneakers * 0.80; // or sneakers - sneakers * 0.20;
//    • Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        double ball = outfit /4 ;
//    • Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        double accessories = ball /5;

        double finalPrice = yearlyTax + sneakers + outfit + ball + accessories;

        System.out.println(finalPrice);
    }
}
