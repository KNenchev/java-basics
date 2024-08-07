package _5_while_loop;

import java.util.Scanner;

public class _2_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userName = sc.nextLine();
        String password = sc.nextLine();

        String passwordCheker = sc.nextLine();

        while (!passwordCheker.equals(password)){
            passwordCheker = sc.nextLine();
        }
        System.out.println("Welcome " + userName + "!");
    }
}
