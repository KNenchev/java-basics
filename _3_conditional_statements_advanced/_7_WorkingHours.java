package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _7_WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (hour >= 10 && hour <= 18 ){
                    System.out.println("open");
                }else{
                    System.out.println("closed");
                }
                break;
            case "Sunday": System.out.println("closed"); break;
            default: break;
        }
    }
}
