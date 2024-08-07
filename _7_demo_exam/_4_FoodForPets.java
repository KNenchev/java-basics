package _7_demo_exam;

import java.util.Scanner;

public class _4_FoodForPets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine());
        double allFood = Double.parseDouble(sc.nextLine());

        double biscuits = 0; // грамажа за бисквити
        double dogFood = 0; // цялата кучешка храна
        double catFood = 0; // цялата котешка храна

        for (int i = 1; i <= days ; i++) {

            double d = Double.parseDouble(sc.nextLine());
            dogFood += d;
            double c = Double.parseDouble(sc.nextLine());
            catFood += c;


            // ако е 3-ти ден получават бисквити
            if( i % 3 == 0){
                // събираме с количеството храна за конкретния ден и умножаваме по 0.10 за да получим 10%
               double biscuitsSum = (d + c) * 0.10;
               //добавяме към общата стойност
               biscuits += biscuitsSum;
            }
        }
        double totalAll = dogFood + catFood;

        System.out.printf("Total eaten biscuits: %dgr.\n",Math.round(biscuits)); // закръгляме до най-близкото число
        System.out.printf("%.2f%% of the food has been eaten.\n", totalAll / allFood * 100); // намеираме процента на изядена храна
        System.out.printf("%.2f%% eaten from the dog.\n", dogFood / totalAll * 100); // процента изядента храна от кучето
        System.out.printf("%.2f%% eaten from the cat.", catFood / totalAll * 100); // процента изядена храна от котката
    }
}
