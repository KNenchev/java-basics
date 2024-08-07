package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _11_FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());

        double price = 0.00;

        switch (fruit){
            case "banana":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday": price = 2.50; System.out.printf("%.2f", price * quantity); break;
                    case "Saturday":
                    case "Sunday": price = 2.70; System.out.printf("%.2f", price * quantity); break;
                    default: System.out.println("error"); break;
                }
                break;
            case "apple":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday": price = 1.2; System.out.printf("%.2f", price * quantity); break;
                    case "Saturday":
                    case "Sunday": price = 1.25; System.out.printf("%.2f", price * quantity); break;
                    default: System.out.println("error"); break;
                }
                break;
            case "orange":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday": price = 0.85; System.out.printf("%.2f", price * quantity); break;
                    case "Saturday":
                    case "Sunday": price = 0.90; System.out.printf("%.2f", price * quantity); break;
                    default: System.out.println("error"); break;
                }
                break;
            case "grapefruit":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday": price = 1.45; System.out.printf("%.2f", price * quantity); break;
                    case "Saturday":
                    case "Sunday": price = 1.60; System.out.printf("%.2f", price * quantity); break;
                    default: System.out.println("error"); break;
                }
                break;
            case "kiwi":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday": price = 2.70; System.out.printf("%.2f", price * quantity); break;
                    case "Saturday":
                    case "Sunday": price = 3.0; System.out.printf("%.2f", price * quantity); break;
                    default: System.out.println("error"); break;
                }
                break;
            case "pineapple":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday": price = 5.50; System.out.printf("%.2f", price * quantity); break;
                    case "Saturday":
                    case "Sunday": price = 5.60; System.out.printf("%.2f", price * quantity); break;
                    default: System.out.println("error"); break;
                }
                break;
            case "grapes":
                switch (day){
                    case "Monday":
                    case "Tuesday":
                    case "Wednesday":
                    case "Thursday":
                    case "Friday": price = 3.85; System.out.printf("%.2f", price * quantity); break;
                    case "Saturday":
                    case "Sunday": price = 4.20; System.out.printf("%.2f", price * quantity); break;
                    default: System.out.println("error"); break;
                }
                break;
            default: System.out.println("error"); break;
        }
    }
}
