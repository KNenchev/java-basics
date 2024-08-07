package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _7_HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String month = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());

        double studio = 0;
        double apartment = 0;

        switch (month) {
            case "May":
            case "October":
                studio = nights * 50;
                apartment = nights * 65;
                if (nights > 7 && nights <= 14) {
                    studio = studio * 0.95;
                } else if (nights > 14) {
                    studio = studio * 0.70;
                    apartment = apartment * 0.90;
                }
                break;
            case "June":
            case "September":
                studio = nights * 75.20;
                apartment = nights * 68.70;
                if (nights > 14) {
                    studio = studio * 0.80;
                    apartment = apartment * 0.90;
                }
                break;
            case "July":
            case "August":
                studio = nights * 76;
                apartment = nights * 77;
                if (nights > 14) {
                    apartment = apartment * 0.90;
                    break;
                }
        }
        System.out.printf("Apartment: %.2f lv.\n", apartment);
        System.out.printf("Studio: %.2f lv.", studio);
    }
}

