package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _2_WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dayOfWeek = sc.nextLine();

        switch (dayOfWeek){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day"); break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend"); break;
            default:
                System.out.println("Error"); break;
        }
    }
}
