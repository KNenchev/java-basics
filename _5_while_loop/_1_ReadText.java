package _5_while_loop;

import java.util.Scanner;

public class _1_ReadText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("Stop")){
            System.out.println(input);
            input = sc.nextLine();
        }


//        while (true){
//            String input = sc.nextLine();
//            if (input.equals("Stop")){
//                break;
//            }
//            System.out.println(input);
//        }
    }
}
