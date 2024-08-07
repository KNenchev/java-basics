package _7_demo_exam;

import java.util.Scanner;

public class _2_FamilyVacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double availableBudget = Double.parseDouble(sc.nextLine());
        int nights = Integer.parseInt(sc.nextLine());
        double pricePeerNight = Double.parseDouble(sc.nextLine());
        int percentExpenses = Integer.parseInt(sc.nextLine());

        if(nights > 7){
            // Ако е над 7 нощувки имаме 5% отстъпка
            pricePeerNight = pricePeerNight * 0.95;
        }

        // изчисляваме допълнителните разходи
        double percent = availableBudget * percentExpenses / 100;

        double totalPriceForNights = pricePeerNight * nights + percent;

        if (availableBudget >= totalPriceForNights){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", availableBudget - totalPriceForNights);
        }else{
            System.out.printf("%.2f leva needed.", totalPriceForNights - availableBudget);
        }
    }
}
