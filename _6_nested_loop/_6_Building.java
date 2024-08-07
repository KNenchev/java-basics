package _6_nested_loop;

import java.util.Scanner;

public class _6_Building {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfFloor = Integer.parseInt(sc.nextLine());
        int numOfRoom = Integer.parseInt(sc.nextLine());

        for (int i = numOfFloor; i >= 1; i--) { // създаваме обърнат цикъл от най-голямото до най малкото
            for (int j = 0; j < numOfRoom; j++) {

                if(i == numOfFloor){
                    System.out.printf("L%d%d ", i, j);
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ", i, j);
                }else{
                    System.out.printf("A%d%d ", i, j);
                }
            }
            System.out.println();
        }
    }
}
