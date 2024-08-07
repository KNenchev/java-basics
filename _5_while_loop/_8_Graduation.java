package _5_while_loop;

import java.util.Scanner;

public class _8_Graduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int counter = 1; // брояч в кой клас е

        int excluded = 0; // брояч колко пъти е бил скъсван

        double sum = 0; // сумата от оценките

        while (counter <= 12) {

            double grade = Double.parseDouble(sc.nextLine()); // оценките

            if (grade < 4.00) { // ако е по малко не преминава
                excluded++;
                if (excluded >= 2) {
                    System.out.printf("%s has been excluded at %d grade", name, counter);
                    break;
                }

                continue; // ако е скъсан само веднъж, трябва да въведем нова оценка за същия клас, пропускайки "counter"
            }

            sum += grade; // сумираме оценките
            counter++; // увеличаваме с 1
        }
        if (excluded < 2) {
            System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12); // намираме средната оценка
        }
    }
}
