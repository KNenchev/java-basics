package _8_exam;

import java.util.Scanner;

public class _2_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int santaMissDays = Integer.parseInt(sc.nextLine());
        int food = Integer.parseInt(sc.nextLine());
        double firstDearFood = Double.parseDouble(sc.nextLine())    ;
        double secondDearFood = Double.parseDouble(sc.nextLine());
        double thirdDearFood = Double.parseDouble(sc.nextLine());

        double neededFoodFirst = santaMissDays * firstDearFood;
        double neededFoodSecond = santaMissDays * secondDearFood;
        double neededFoodThird = santaMissDays * thirdDearFood;

        double total = neededFoodFirst + neededFoodSecond + neededFoodThird;

        if (food >= total){
            System.out.printf("%.0f kilos of food left.", Math.floor(food - total));
        }else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(total - food));
        }
    }
}
