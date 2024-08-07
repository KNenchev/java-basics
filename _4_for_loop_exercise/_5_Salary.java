package _4_for_loop_exercise;

import java.util.Scanner;

public class _5_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int openTabs = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= openTabs; i++) {
            String siteName = sc.nextLine();

            if (siteName.equals("Facebook")) {
                salary -= 150;
            } else if (siteName.equals("Instagram")) {
                salary -= 100;
            } else if (siteName.equals("Reddit")) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
//        if (salary == 0) {
//            System.out.println("You have lost your salary.");
//        }else {
//            System.out.println(salary);
//        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}
