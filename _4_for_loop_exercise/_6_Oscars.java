package _4_for_loop_exercise;

import java.util.Scanner;

public class _6_Oscars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nameOfActor = sc.nextLine();
        double academyPoints = Double.parseDouble(sc.nextLine());
        int numberOfAssessors = Integer.parseInt(sc.nextLine());


        for (int i = 1; i <= numberOfAssessors; i++) {
            String names = sc.nextLine();
            double points = Double.parseDouble(sc.nextLine());

            academyPoints = academyPoints + names.length() * points / 2;

            if (academyPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameOfActor, academyPoints);
                break;
            }
        }
        if(academyPoints < 1250.5){
            double difference = 1250.5 - academyPoints;
            System.out.printf("Sorry, %s you need %.1f more!", nameOfActor, difference);
        }
    }
}
