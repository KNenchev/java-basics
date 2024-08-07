package _1_first_steps_exercise;

import java.util.Scanner;

public class _4_RequiredReading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pages = Integer.parseInt(sc.nextLine());
        int pagesPeerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int hoursPeerDay = (pages / pagesPeerHour) / days;
        System.out.println(hoursPeerDay);
    }
}
