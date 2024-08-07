package _4_for_loop;

import java.util.Scanner;

public class _2_NumbersNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for(int i = num; i >= 1 ; i--){
            System.out.println(i);
        }
    }
}
