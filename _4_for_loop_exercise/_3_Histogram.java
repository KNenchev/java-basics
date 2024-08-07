package _4_for_loop_exercise;

import java.util.Scanner;

public class _3_Histogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int p1 = 0,
            p2 = 0,
            p3 = 0,
            p4 = 0,
            p5 = 0;

        for (int i = 0; i < n; i++) {
            int nums = Integer.parseInt(sc.nextLine());

            if (nums < 200) {
                p1++;
            }else if (nums < 400) {
                p2++;
            }else if (nums < 600) {
                p3++;
            }else if (nums < 800) {
                p4++;
            }else{
                p5++;
            }
        }
        double p1Percent = p1 * 1.0 / n * 100,
               p2Percent = p2 * 1.0 / n * 100,
               p3Percent = p3 * 1.0 / n * 100,
               p4Percent = p4 * 1.0 / n * 100,
               p5Percent = p5 * 1.0 / n * 100;

        System.out.printf("%.02f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%", p1Percent, p2Percent, p3Percent, p4Percent, p5Percent);
    }
}
