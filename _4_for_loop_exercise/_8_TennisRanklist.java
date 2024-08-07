package _4_for_loop_exercise;

import java.util.Scanner;

public class _8_TennisRanklist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//    • W - ако е победител получава 2000 точки
//    • F - ако е финалист получава 1200 точки
//    • SF - ако е полуфиналист получава 720 точки

        int tournaments = Integer.parseInt(sc.nextLine());
        int startPoints = Integer.parseInt(sc.nextLine());

        int tournamentsWining = 0;
        int points = 0;

        for (int i = 1; i <= tournaments ; i++) {
            String stage = sc.nextLine();

            if (stage.equals("W")){
                tournamentsWining++;
                points += 2000;
            } else if (stage.equals("F")) {
                points += 1200;
            } else if (stage.equals("SF")) {
                points += 720;
            }
        }
        int totalPoints = startPoints + points;

        int averagePoints =  points / tournaments;

        double percentWins = (tournamentsWining * 1.0 / tournaments) * 100;

        System.out.println("Final points: " + totalPoints);
        System.out.println("Average points: " + averagePoints);
        System.out.printf("%.2f%%" ,percentWins);
    }
}
