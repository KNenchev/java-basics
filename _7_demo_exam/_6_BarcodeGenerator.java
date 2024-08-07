package _7_demo_exam;

import java.util.Scanner;

public class _6_BarcodeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String start = sc.nextLine();
        String end = sc.nextLine();

        // преобразуваме от Стринг към Инт и използваме ЧарАт за да отделим всяка цифра от числото и да я присвоим към отделна променлива
        int firstStart = Integer.parseInt(String.valueOf(start.charAt(0)));
        int secondStart = Integer.parseInt(String.valueOf(start.charAt(1)));
        int thirdStart = Integer.parseInt(String.valueOf(start.charAt(2)));
        int forthStart = Integer.parseInt(String.valueOf(start.charAt(3)));

        int firstEnd = Integer.parseInt(String.valueOf(end.charAt(0)));
        int secondEnd = Integer.parseInt(String.valueOf(end.charAt(1)));
        int thirdEnd = Integer.parseInt(String.valueOf(end.charAt(2)));
        int forthEnd = Integer.parseInt(String.valueOf(end.charAt(3)));

        // Тук ще използваме 4 for цикли защото числото е четирицифрено. Започваме от първия цикъл "i",
        // докато i = на първата цифра(firstStart) от числото и i е по- мало или равно на последната(firstEnd) цифра
        // върти цикла. След това проверяваме, за всяка от цифрите дали е нечетно и ако е вяро слизаме и проверяваме за останалите по същия начин.
        for (int i = firstStart; i <= firstEnd; i++) {
            if (i % 2 != 0) {
                for (int j = secondStart; j <= secondEnd; j++) {
                    if (j % 2 != 0) {
                        for (int k = thirdStart; k <= thirdEnd; k++) {
                            if (k % 2 != 0) {
                                for (int l = forthStart; l <= forthEnd; l++) {
                                    if (l % 2 != 0){
                                        System.out.printf("%d%d%d%d ", i,j,k,l);
                                        // Накрая отпечатваме само цифрите, който са преминали през всички проверки
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
