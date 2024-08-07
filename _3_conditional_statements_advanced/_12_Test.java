package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _12_Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String city = sc.nextLine();
        double seals = Double.parseDouble((sc.nextLine()));

        double commission = 0;
        
        boolean isValid = true;

        switch (city){
            // Sofia 5%, 7%, 8%, 12%
            case "Sofia" :
                if (seals >= 0 && seals <= 500){
                    commission = seals * 0.05;
                }else if (seals > 500 && seals <= 1000) {
                    commission = seals * 0.07;
                }else if (seals > 1000 && seals <= 10000) {
                    commission = seals * 0.08;
                } else if (seals > 10000) {
                    commission = seals * 0.12;
                }else{
                    isValid = false;
                }
                break;
            case "Varna" :
                // Varna 4.5%, 7.5%, 10%, 13%
                if (seals >= 0 && seals <= 500){
                    commission = seals * 0.045;
                }else if (seals > 500 && seals <= 1000) {
                    commission = seals * 0.075;
                }else if (seals > 1000 && seals <= 10000) {
                    commission = seals * 0.10;
                } else if (seals > 10000) {
                    commission = seals * 0.13;
                }else{
                    isValid = false;
                }
                break;
            case "Plovdiv" :
                // Plovdiv 5.5%, 8%, 12%, 14.5%
                if (seals >= 0 && seals <= 500){
                    commission = seals * 0.055;
                }else if (seals > 500 && seals <= 1000) {
                    commission = seals * 0.08;
                }else if (seals > 1000 && seals <= 10000) {
                    commission = seals * 0.12;
                } else if (seals > 10000) {
                    commission = seals * 0.145;
                }else{
                    isValid = false;
                }
                break;
            default: isValid = false; break;
        }

        if (!isValid){
            System.out.println("error");
        }else{
        System.out.printf("%.2f", commission);
        }
    }
}
