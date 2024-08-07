package _6_nested_loop;

import java.util.Scanner;

public class _4_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = Integer.parseInt(sc.nextLine());
        int secondNum = Integer.parseInt(sc.nextLine());
        int magicNum = Integer.parseInt(sc.nextLine());

        int counter = 0;

        boolean isMagicFound = false;

        for (int i = firstNum; i <= secondNum; i++) {
            for (int j = firstNum; j <= secondNum; j++) {

                counter++;
                int sum = i + j;

                if (sum == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, i, j, magicNum);

                    isMagicFound = true; // магическото число е намерено и прекратяваме цикъла
                    break;
                }
            }
            if (isMagicFound) {
                break; // ако магическото число в (for (j)) цикъла е намерено излез и от (for (i)) цикъла
            }
        }
        if (!isMagicFound) { // ако магическото число не е намерено само тогава принтирай
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
