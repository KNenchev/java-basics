package _4_for_loop_exercise;

import java.util.Scanner;

public class _4_CleverLily {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lilyAge = Integer.parseInt(sc.nextLine());
        double washMachinePrice = Double.parseDouble(sc.nextLine());
        int toyPrice = Integer.parseInt(sc.nextLine());

        int toysAge = 0;
        int moneyAge = 0;
        int totalMoney = 0;

        for (int i = 1; i <= lilyAge; i++) {

            if (i % 2 == 0){
                moneyAge += 10;
                totalMoney += moneyAge - 1; // братът на лили взема 1лв.
            }else{
                toysAge ++;
            }
        }
        int toysTotalPrice = toysAge * toyPrice;

        totalMoney = totalMoney + toysTotalPrice;

        if(totalMoney >= washMachinePrice){
            System.out.printf("Yes! %.2f", totalMoney - washMachinePrice);
        }else{
            System.out.printf("No! %.2f", washMachinePrice - totalMoney);
        }
    }
}
