package _8_exam;

import java.util.Scanner;

public class _4_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = Integer.parseInt(sc.nextLine());

        int counterG1 = 0;
        int counterG2 = 0;
        int counterG3 = 0;
        int counterG4 = 0;
        double totalGrade = 0;
        for (int i = 1; i <= students ; i++) {

            double studentGrade = Double.parseDouble(sc.nextLine());
            totalGrade += studentGrade;

            if (studentGrade < 3){
                counterG1 ++;
            } else if (studentGrade < 4) {
                counterG2 ++;
            } else if (studentGrade < 5) {
                counterG3++;
            }else {
                counterG4++;
            }
        }
        System.out.printf("Top students: %.2f%%\n", counterG4 * 1.0 / students * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", counterG3 * 1.0 / students * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", counterG2 * 1.0 / students * 100);
        System.out.printf("Fail: %.2f%%\n", counterG1 * 1.0 / students * 100);
        System.out.printf("Average: %.2f", totalGrade / students);
    }
}
