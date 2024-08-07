package _6_nested_loop_exercise;

import java.util.Scanner;

public class _1_NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());

        int count = 1;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(count + " ");
                count++;
                if (count > n){
                    break;
                }
            }
            if (count > n){
                break;
            }
            System.out.println(); // разграничава итерациите
        }
    }
}
