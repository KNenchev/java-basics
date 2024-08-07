package _8_exam;

import java.util.Scanner;

public class _6_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int lastN = n % 10;

        for (int a = 1; a <= 9; a++) {
            for (int b = 9; b >= a; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c; d--) {
                        if ((a + b + c + d) == (a * b * c * d)) {
                            if (lastN == 5) {
                                System.out.println("" + a + b + c + d);
                                return;
                            }
                        }
                        if (((a * b * c * d) / (a + b + c + d)) == 3) {
                            if (n % 3 == 0) {
                                if (d > 0) {
                                    System.out.println("" + d + c + b + a);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Nothing found");

    }
}
