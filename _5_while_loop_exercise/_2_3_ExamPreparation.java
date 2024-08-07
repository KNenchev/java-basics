package _5_while_loop_exercise;

import java.util.Scanner;

public class _2_3_ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int possibleBadGrades = Integer.parseInt(sc.nextLine());

        int badGrades = 0;
        int tasks = 0;
        double sum = 0;
        String lastTask = "";
        boolean isFiled = true;

        while (badGrades < possibleBadGrades){

            String exercises = sc.nextLine();
            if (exercises.equals("Enough")){
                isFiled = false;
                break;
            }
            int grade = Integer.parseInt(sc.nextLine());
            if (grade <= 4){
                badGrades++;
            }
            sum += grade;
            tasks ++;
            lastTask = exercises;
        }
        if (isFiled){
            System.out.printf("You need a break, %d poor grades.", possibleBadGrades);
        }else {
            System.out.printf("Average score: %.2f\n", sum / tasks);
            System.out.println("Number of problems: " +  tasks);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
