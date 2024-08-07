package _1_first_steps_exercise;

import java.util.Scanner;

public class _5_StudyMaterials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double penPacks = Double.parseDouble(sc.nextLine()) * 5.8;
        double markerPacks = Double.parseDouble(sc.nextLine()) * 7.2;
        double cleaningPacks = Double.parseDouble(sc.nextLine()) * 1.2;
        double discount = Double.parseDouble(sc.nextLine()) / 100;

        double materialPrice = penPacks + markerPacks + cleaningPacks;
        double total = materialPrice - (materialPrice * discount);

        System.out.println(total);
    }
}
