package _1_first_steps_exercise;

import java.util.Scanner;

public class _2_RadianToDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radian = Double.parseDouble(sc.nextLine());
        double degree = radian * 180 / Math.PI;
        System.out.println(degree);
    }
}
