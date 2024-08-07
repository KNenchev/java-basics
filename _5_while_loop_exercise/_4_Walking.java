package _5_while_loop_exercise;

import java.util.Scanner;

public class _4_Walking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        int sumSteps = 0;

        while (!input.equals("Going home")){

            int steps = Integer.parseInt(input);

            sumSteps += steps;
            if (sumSteps >= 10000){
                break;
            }
            input = sc.nextLine();
        }
        if (input.equals("Going home")){
            int stepsAfterGoingHome = Integer.parseInt(sc.nextLine());
            sumSteps += stepsAfterGoingHome;
        }
        if (sumSteps >= 10000){
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", sumSteps - 10000);
        }else {
            System.out.printf("%d more steps to reach goal.", 10000 - sumSteps);
        }
    }
}
