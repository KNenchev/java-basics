package _1_first_steps_exercise;

import java.util.Scanner;

public class _6_Painting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int thinner = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        // Calculation
        double nylonSum = (nylon +2) * 1.5;
        double paintSum = (paint + paint * 0.10) * 14.5;
        double thinnerSum = thinner * 5;

        // Material sum + (0.40 bags)
        double materialSum = nylonSum + paintSum + thinnerSum + 0.40;

        // Workers Paid
        double workersPaid = (materialSum * 0.30) * hours;

        // total
        double total = materialSum + workersPaid;
        System.out.println(total);

    }
}
