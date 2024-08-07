package _8_exam;

import java.util.Scanner;

public class _3_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dancerN = Integer.parseInt(sc.nextLine());
        double points = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String place = sc.nextLine();

        double total = 0;

        if (place.equals("Bulgaria")){
            total = points * dancerN;
            if (season.equals("summer")){
                total = total * 0.95;
            }else {
                total = total * 0.92;
            }
        }else {
            total = (points * dancerN) * 1.5;
            if (season.equals("summer")){
                total = total * 0.90;
            }else {
                total = total * 0.85;
            }
        }

        double charity = total * 0.75;
        double peerDancer = (total - charity) / dancerN;

        System.out.printf("Charity - %.2f\n", charity);
        System.out.printf("Money per dancer - %.2f", peerDancer);
    }
}
