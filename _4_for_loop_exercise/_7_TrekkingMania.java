package _4_for_loop_exercise;

import java.util.Scanner;

public class _7_TrekkingMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int groupsNum = Integer.parseInt(sc.nextLine());

        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        int g5 = 0;
        

        for (int i = 1; i <= groupsNum ; i++) {

            int peopleN = Integer.parseInt(sc.nextLine());

            if (peopleN < 6){
                g1 += peopleN;
            } else if (peopleN < 13) {
                g2 += peopleN;
            }else if (peopleN < 26) {
                g3 += peopleN;
            }else if (peopleN < 41) {
                g4 += peopleN;
            }else {
                g5 += peopleN;
            }
        }
        int total = g1 + g2 + g3 + g4 + g5;

        double percent1 = (g1 * 1.0 / total) * 100;
        double percent2 = (g2 * 1.0 / total) * 100;
        double percent3 = (g3 * 1.0 / total) * 100;
        double percent4 = (g4 * 1.0 / total) * 100;
        double percent5 = (g5 * 1.0 / total) * 100;

        System.out.printf("%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n%.2f%%\n" ,percent1, percent2, percent3, percent4, percent5);
    }
}
