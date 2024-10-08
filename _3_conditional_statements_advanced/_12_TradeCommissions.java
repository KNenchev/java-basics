package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _12_TradeCommissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        double sales = Double.parseDouble(sc.nextLine());

        double commission = 0.0;

        boolean isValid = true;

        if (city.equals("Sofia")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.05;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.07;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.08;
            } else if (sales > 10000) {
                commission = sales * 0.12;
            } else {
                isValid = false;
            }
        } else if (city.equals("Varna")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.045;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.075;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.10;
            } else if (sales > 10000) {
                commission = sales * 0.13;
            } else {
                isValid = false;
            }
        } else if (city.equals("Plovdiv")) {
            if (sales >= 0 && sales <= 500) {
                commission = sales * 0.055;
            } else if (sales > 500 && sales <= 1000) {
                commission = sales * 0.08;
            } else if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.12;
            } else if (sales > 10000) {
                commission = sales * 0.145;
            } else {
                isValid = false;
            }
        }else {
            isValid = false;
        }
        if (!isValid){
            System.out.println("error");
        }else{
            System.out.printf("%.2f", commission);
        }
    }
}
