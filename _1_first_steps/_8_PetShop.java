package _1_first_steps;

import java.util.Scanner;

public class _8_PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dogPacs = Double.parseDouble(sc.nextLine()) * 2.5 ;
        double catPacs = Double.parseDouble(sc.nextLine()) * 4;

        double total = dogPacs + catPacs;

        System.out.println(total + " lv.");

    }
}
