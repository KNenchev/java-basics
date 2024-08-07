package _6_nested_loop_exercise;

import java.util.Scanner;

public class _4_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine()); // броя на хората в журито
        String presentation = sc.nextLine(); // името на презентацията

        int countPresentation = 0; // брояч за презентациите
        double totalAll = 0; // вс.оценки на пезентациите


        while (!presentation.equals("Finish")){

            countPresentation ++;
            double averagePresentationScore = 0;

            for (int i = 1; i <= n ; i++) {
                double grade = Double.parseDouble(sc.nextLine()); // оценка на презентацията
                averagePresentationScore += grade;
            }
            double average = averagePresentationScore / n;
            System.out.printf( "%s - %.2f.\n", presentation, average);

            totalAll += average;

            presentation = sc.nextLine();
        }
        double averageAll = totalAll / countPresentation;
        System.out.printf("Student's final assessment is %.2f.", averageAll);
    }
}
