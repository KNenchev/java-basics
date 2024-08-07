package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _6_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
        char operator = sc.next(".").charAt(0);

        String evenOrOdd = "";

        if (operator == '+') {
            int function = n1 + n2;
            if (function % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %c %d = %d - %s", n1, operator, n2, function, evenOrOdd);
        } else if (operator == '-') {
            int function = n1 - n2;
            if (function % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %c %d = %d - %s", n1, operator, n2, function, evenOrOdd);
        } else if (operator == '*') {
            int function = n1 * n2;
            if (function % 2 == 0) {
                evenOrOdd = "even";
            } else {
                evenOrOdd = "odd";
            }
            System.out.printf("%d %c %d = %d - %s", n1, operator, n2, function, evenOrOdd);
        } else if (operator == '/') {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);

            } else {
                double function = n1 * 1.0 / n2;
                System.out.printf("%d %c %d = %.2f", n1, operator, n2, function);
            }
        } else if (operator == '%') {
            if (n2 == 0) {
                System.out.printf("Cannot divide %d by zero", n1);
            }else{
                int function = n1 % n2;
                System.out.printf("%d %c %d = %d", n1, operator, n2, function);
            }
        }
    }
}
