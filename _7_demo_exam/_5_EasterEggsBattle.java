package _7_demo_exam;

import java.util.Scanner;

public class _5_EasterEggsBattle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int playerOne = Integer.parseInt(sc.nextLine());
        int playerTwo = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();

        while (!command.equals("End")){

            if (command.equals("one")){
                playerTwo--;
                if (playerTwo <= 0){
                    System.out.printf("Player two is out of eggs. Player one has %d eggs left.", playerOne);
                    break;
                }
            }else {
                playerOne--;
                    if (playerOne <= 0) {
                        System.out.printf("Player one is out of eggs. Player two has %d eggs left.", playerTwo);
                        break;
                    }
            }
            command = sc.nextLine();
        }
        if(playerOne > 0 && playerTwo > 0){
            System.out.printf("Player one has %d eggs left.\n", playerOne);
            System.out.printf("Player two has %d eggs left.", playerTwo);
        }
    }
}
