package _5_while_loop_exercise;

import java.util.Scanner;

public class _1_OldBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String book = sc.nextLine();

        int counter = 0;
        boolean isFound = false;

        String input = sc.nextLine();

        while (!input.equals("No More Books")){
            if (input.equals(book)){
                isFound = true;
                break;
            }
            counter++;
            input = sc.nextLine();
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", counter);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", counter);
        }
    }
}
