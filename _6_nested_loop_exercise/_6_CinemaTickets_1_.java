package _6_nested_loop_exercise;

import java.util.Scanner;

public class _6_CinemaTickets_1_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String movieName = sc.nextLine();


        int studentCounter = 0;
        int standardCounter = 0;
        int kidCounter = 0;


        while (!movieName.equals("Finish")) {

            int totalCounter = 0;
            int availableSeats = Integer.parseInt(sc.nextLine());

            for (int i = 1; i <= availableSeats; i++) {

                String ticketType = sc.nextLine();

                if (ticketType.equals("End")) {
                    break;
                } else if (ticketType.equals("student")) {
                    studentCounter++;
                } else if (ticketType.equals("standard")) {
                    standardCounter++;
                } else {
                    kidCounter++;
                }
                totalCounter++;
            }

            System.out.printf("%s - %.2f%% full.\n", movieName, totalCounter * 1.0 / availableSeats * 100);
            movieName = sc.nextLine();
        }
        int totalTickets = studentCounter + standardCounter + kidCounter;
        System.out.println("Total tickets: " + totalTickets);
        System.out.printf("%.2f%% student tickets.\n", studentCounter * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standardCounter * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidCounter * 1.0 / totalTickets * 100);

    }
}
