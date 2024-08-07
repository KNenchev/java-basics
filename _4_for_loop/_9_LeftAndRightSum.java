package _4_for_loop;

import java.util.Scanner;

public class _9_LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int leftSide = 0;
        for(int i = 0; i < n; i++){
            leftSide += Integer.parseInt(sc.nextLine());
        }
        int rightSide = 0;
        for(int i = 0; i < n; i++){
            rightSide += Integer.parseInt(sc.nextLine());
        }
        if(leftSide == rightSide){
            System.out.println("Yes, sum = " + leftSide);
        }else{
            System.out.println("No, diff = " + Math.abs(leftSide - rightSide));
        }
    }
}
