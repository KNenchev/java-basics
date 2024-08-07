package _5_while_loop;

import java.util.Scanner;

public class _4_Sequence2k1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int num = 1;

        while (num <= n){
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}
