package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _5_Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();

        String destination = "";
        String place = "";
        double sum = 0;

        switch (season) {
            case "summer":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    place = "Camp";
                    sum = budget * 0.30;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    place = "Camp";
                    sum = budget * 0.40;
                } else if(budget > 1000) {
                destination = "Europe";
                place = "Hotel";
                sum = budget * 0.90;
            }
            break;
            case "winter":
                if (budget <= 100) {
                    destination = "Bulgaria";
                    place = "Hotel";
                    sum = budget * 0.70;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    place = "Hotel";
                    sum = budget * 0.80;
                } else if(budget > 1000) {
                destination = "Europe";
                place = "Hotel";
                sum = budget * 0.90;
            }
            break;
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", place, sum);
    }
}
