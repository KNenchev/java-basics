package _4_for_loop;

import java.util.Scanner;

public class _4_EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= n; i += 2){
            System.out.println(Math.pow(2, i));
        }
    }
}
