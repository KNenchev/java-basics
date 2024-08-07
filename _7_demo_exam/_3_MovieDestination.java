package _7_demo_exam;

import java.util.Scanner;

public class _3_MovieDestination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double movieBudget = Double.parseDouble(sc.nextLine());
        String destination = sc.nextLine();
        String season = sc.nextLine();
        int days = Integer.parseInt(sc.nextLine());

        double price = 0;


            switch (season){
                case "Winter":
                    if (destination.equals("Dubai")){
                        // умножаваме дните по цената за един ден(45000) и я излчисяваме като вземаме предив и 30% отсъпка
                        price = (45000 * days) * 0.70 ;
                    } else if (destination.equals("Sofia")) {
                        // тък пък имаме 25% оскъпяване
                        price = (17000 * days) * 1.25;
                    }else {
                        price = 24000 * days;
                    }
                    break;
                case "Summer":
                    if (destination.equals("Dubai")){
                        price = (40000 * days) * 0.70;
                    } else if (destination.equals("Sofia")) {
                        price = (12500 * days) * 1.25;
                    }else {
                        price = 20250 * days;
                    }
                    break;
            }
        if (movieBudget >= price){
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", movieBudget - price);
        }else {
            System.out.printf("The director needs %.2f leva more!", price - movieBudget);
        }
    }
}
