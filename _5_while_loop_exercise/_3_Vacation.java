package _5_while_loop_exercise;

import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double moneyForTrip = Double.parseDouble(sc.nextLine());
        double availableMoney = Double.parseDouble(sc.nextLine());

        int countDays = 0; // Дните
        int countSpend = 0;

        while (availableMoney < moneyForTrip) {

            if (countSpend >= 5){
                System.out.println("You can't save the money.");
                System.out.println(countDays);
                break;
            }

            countDays++;

            String action = sc.nextLine();
            double money = Double.parseDouble(sc.nextLine());

            if (action.equals("spend")) {
                countSpend++;
                availableMoney -= money;
            } else {
                availableMoney += money;
                countSpend = 0;
            }

            if (availableMoney < 0) { // Ако иска да похарчи повече от наличните си пари, то тя ще похарчи всичките и ще ѝ останат 0 лева.
                availableMoney = 0;
            }
        }
        if (countSpend < 5){
            System.out.printf("You saved the money for %d days.", countDays);
        }
    }
}
