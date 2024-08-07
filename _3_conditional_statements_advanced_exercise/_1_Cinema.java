package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String typeProjection = sc.nextLine();
        int lines = Integer.parseInt(sc.nextLine());
        int columns = Integer.parseInt(sc.nextLine());

        double price = 0;

        switch (typeProjection) {
            case "Premiere":
                price = 12.0;
                break;
            case "Normal":
                price = 7.50;
                break;
            case "Discount":
                price = 5.0;
                break;
        }
        double fullHall = price * lines * columns;
        System.out.printf("%.2f leva", fullHall);
    }
}
