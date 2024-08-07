package _5_while_loop;

import java.util.Scanner;

public class _7_MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        int minNumber = Integer.MAX_VALUE;

        while (!command.equals("Stop")){

            int n = Integer.parseInt(command);

            if (n < minNumber){
                minNumber = n;
            }
            command = sc.nextLine();
        }
        System.out.println(minNumber);
    }
}
