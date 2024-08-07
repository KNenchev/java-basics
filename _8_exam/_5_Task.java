package _8_exam;

import java.util.Scanner;

public class _5_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String playerName = sc.nextLine();

        int playerScore = 0;
        String winner = "";
        boolean hatTrick = false;

        while (!playerName.equals("END")){

            int score = Integer.parseInt(sc.nextLine());

            if(score > playerScore){
                playerScore = score;
                winner = playerName;
            }
            if (score >= 3 && score < 10){
                hatTrick = true;
            }if (score >= 10){
                hatTrick = true;
                break;
            }

            playerName = sc.nextLine();
        }
        System.out.printf("%s is the best player!\n", winner);
        if (hatTrick){
            System.out.printf("He has scored %d goals and made a hat-trick !!!\n", playerScore);
        }else {
            System.out.printf("He has scored %d goals.", playerScore);
        }
    }
}
