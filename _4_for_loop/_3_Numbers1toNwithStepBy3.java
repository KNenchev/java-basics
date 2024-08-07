package _4_for_loop;

import java.util.Scanner;

public class _3_Numbers1toNwithStepBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= n; i += 3){
            System.out.println(i);
        }
    }
}
