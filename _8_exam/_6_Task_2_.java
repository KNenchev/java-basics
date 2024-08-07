package _8_exam;

import java.util.Scanner;

public class _6_Task_2_ {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int lastDigit = n % 10; // намираме последната цифра от въведеното число

        boolean firstCombination = false;

//        За всяка комбинация четирите цифри a, b, c и d се променят по следния начин:
        //    • a се мени от 1 до 9
        for (int a = 1; a <= 9; a++) {
            //    • b се мени от 9 до а
            for (int b = 9; b >= a; b--) {
                //    • c се мени от 0 до 9
                for (int c = 0; c <= 9; c++) {
                    //    • d се мени от 9 до c
                    for (int d = 9; d >= c; d--) {
                        //Ако сумата (a + b + c + d) е равна на произведението (a * b * c * d)
                        if ((a + b + c + d) == (a * b * c * d) && lastDigit == 5) {
                            System.out.print("" + a + b + c + d);
                            firstCombination = true;
                            break;
                        }
                        if (firstCombination) {
                            break;
                        }
                        // Ако разделим произведението (a * b * c * d) на сумата (a + b + c + d)
                        // и получим 3 (целочислено), и едновременно с това n се дели на 3 без остатък
                        if ((a * b * c * d) / (a + b + c + d) == 3 && n % 3 == 0) {
                            System.out.print("" + d + c + b + a);
                            firstCombination = true;
                            break;
                        }
                        if (firstCombination) {
                            break;
                        }
                    }
                }
            }
        }
        if (!firstCombination) {
            System.out.println("Nothing found");
        }
    }
}
