package _5_while_loop_exercise;

import java.util.Scanner;

public class _5_Coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double change = Double.parseDouble(sc.nextLine());

        double coins = Math.floor(change * 100); // "100" - защото 1лев. има 100 стотинки

        int counter = 0;

        while (coins > 0){

            if (coins >= 200){ // 200 == 2лв. - най голямата монетна стойност в България.
                coins  -= 200;
            }else if (coins >= 100){
                coins -= 100;
            }else if (coins >= 50){
                coins -= 50;
            }else if (coins >= 20){
                coins -= 20;
            }else if (coins >= 10){
                coins -= 10;
            }else if (coins >= 5){
                coins -= 5;
            }else if (coins >= 2){
                coins -= 2;
            }else if (coins >= 1){
                coins -= 1;
            }
            counter++;
        }
        System.out.println(counter);
    }
}
