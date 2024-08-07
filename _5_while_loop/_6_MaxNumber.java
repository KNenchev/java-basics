package _5_while_loop;

import java.util.Scanner;

public class _6_MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!command.equals("Stop")){

            int n = Integer.parseInt(command);

            if (n > maxNumber){
                maxNumber = n;
            }
            command = sc.nextLine();
        }
        System.out.println(maxNumber);
    }
}
