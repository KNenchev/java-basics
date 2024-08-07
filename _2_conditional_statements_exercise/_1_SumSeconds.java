package _2_conditional_statements_exercise;

import java.util.Scanner;

public class _1_SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstPlace = Integer.parseInt(sc.nextLine());
        int secondPlace = Integer.parseInt(sc.nextLine());
        int thirdPlace = Integer.parseInt(sc.nextLine());

        int finalTime = firstPlace + secondPlace + thirdPlace;
        int minutes = finalTime / 60;
        int second = finalTime % 60;

       if(second < 10){
           System.out.printf("%d:0%d", minutes, second);
       }else{
           System.out.printf("%d:%d", minutes, second);
       }
    }
}
