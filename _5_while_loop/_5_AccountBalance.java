package _5_while_loop;

import java.util.Scanner;

public class _5_AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pay = sc.nextLine();

        double total = 0;

        while (!pay.equals("NoMoreMoney")) {

            double paymentDouble = Double.parseDouble(pay);

            if(paymentDouble < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n", paymentDouble);
            total += paymentDouble;

            pay = sc.nextLine();
        }
        System.out.printf("Total: %.2f", total);
    }
}
