package _6_nested_loop_exercise;

import java.util.Scanner;

public class _3_SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        int prime = 0;
        int notPrime = 0;

        while (!command.equals("stop")) {

            int input = Integer.parseInt(command);

            if (input < 0) {
                System.out.println("Number is negative.");
            }else {
                boolean isPrime = true;

                for (int i = 2; i < input ; i++) {
                    if (input % i == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    prime += input;
                }else {
                    notPrime += input;
                }
            }
            command = sc.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " +prime);
        System.out.println("Sum of all non prime numbers is: " + notPrime);
    }
}
