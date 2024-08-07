package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _8_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hoursOfExam = Integer.parseInt(sc.nextLine());
        int minutesOfExam = Integer.parseInt(sc.nextLine());
        int hourOfArrival = Integer.parseInt(sc.nextLine());
        int minuteOfArrival = Integer.parseInt(sc.nextLine());

        int totalMinExam = hoursOfExam * 60 + minutesOfExam;
        int totalMinArrival = hourOfArrival * 60 + minuteOfArrival;

        int difference = Math.abs(totalMinExam - totalMinArrival);

        if(totalMinArrival > totalMinExam){
            System.out.println("Late");
            if (difference < 60){
                System.out.printf("%d minutes after the start", difference);
            }else{
                int hours = difference / 60;
                int minutes = difference % 60;
                System.out.printf("%d:%02d hours after the start", hours , minutes);
            }
        } else if (difference <= 30) {
            System.out.println("On time");
            if (totalMinExam != totalMinArrival){
                System.out.printf("%d minutes before the start", difference);
            }

        }else {
            System.out.println("Early");
            int hours = difference / 60;
            int minutes = difference % 60;
            if (difference < 60){
                System.out.printf("%d minutes before the start", minutes);
            }else{
                System.out.printf("%d:%02d hours before the start ", hours, minutes);
            }
        }
    }
}
