package _5_while_loop_exercise;

import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int z = Integer.parseInt(sc.nextLine());

        int totalSpace = x * y * z;

        while (totalSpace > 0){

            String boxes = sc.nextLine();
            if (boxes.equals("Done")){
                break;
            }
            int sqM = Integer.parseInt(boxes);
            totalSpace -= sqM;
        }
        if (totalSpace > 0){
            System.out.printf("%d Cubic meters left.", totalSpace);
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalSpace));
        }
    }
}
