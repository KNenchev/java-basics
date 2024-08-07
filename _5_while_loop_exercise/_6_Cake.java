package _5_while_loop_exercise;

import java.util.Scanner;

public class _6_Cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int high = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        int holeCake = high * width;


        while (holeCake > 0) {

            String pieces = sc.nextLine();
            if (pieces.equals("STOP")) {
                break;
            }
            int nOfPieces = Integer.parseInt(pieces);
            holeCake -= nOfPieces;
        }
        if (holeCake > 0) {
            System.out.printf("%d pieces are left.", holeCake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(holeCake));
        }
    }
}
