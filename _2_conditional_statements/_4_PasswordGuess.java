package _2_conditional_statements;

import java.util.Scanner;

public class _4_PasswordGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        if (password.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");
        }
    }
}
