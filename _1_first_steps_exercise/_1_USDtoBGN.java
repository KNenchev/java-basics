package _1_first_steps_exercise;

import java.util.Scanner;

public class _1_USDtoBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double USD = Double.parseDouble(sc.nextLine());
        double BGN = USD * 1.7954;

        System.out.println(BGN);
    }
}
