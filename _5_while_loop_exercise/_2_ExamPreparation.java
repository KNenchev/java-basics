package _5_while_loop_exercise;

import java.util.Scanner;

public class _2_ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int badGradeNumber = Integer.parseInt(sc.nextLine());

        String task = sc.nextLine();

        int counter = 0;
        int correctSolutions = 0;
        String lastTask = "";

        double sum = 0;


        while (!task.equals("Enough")) {

            double grade = Double.parseDouble(sc.nextLine());

            if (grade <= 4){
                counter++;
            }if (counter >= badGradeNumber){
                System.out.printf("You need a break, %d poor grades.", counter);
                break;
            }
            lastTask = task;
            correctSolutions++;
            sum += grade;
            task = sc.nextLine();
        }
        if (counter < badGradeNumber){
            System.out.printf("Average score: %.2f\n", sum / correctSolutions);
            System.out.println("Number of problems: " +  correctSolutions);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
