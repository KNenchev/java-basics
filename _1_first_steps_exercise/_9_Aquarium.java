package _1_first_steps_exercise;

import java.util.Scanner;

public class _9_Aquarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//           Вход
//        1. Дължина в см – цяло число в интервала [10 … 500]
        int length = Integer.parseInt(sc.nextLine());
//        2. Широчина в см – цяло число в интервала [10 … 300]
        int width = Integer.parseInt(sc.nextLine());
//        3. Височина в см – цяло число в интервала [10… 200]
        int height = Integer.parseInt(sc.nextLine());
//        4. Процент  – реално число в интервала [0.000 … 100.000]
        double percent = Double.parseDouble(sc.nextLine());

        // Сметки
        double volume = (length * width * height) * 0.001;
        double percentVolume = percent / 100;
        double finalLitters = volume - (volume * percentVolume);

        System.out.println(finalLitters);
    }
}
