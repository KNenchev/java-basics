package _6_nested_loop;

import java.util.Scanner;

public class _5_Travelling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String destination = sc.nextLine();


        while (!destination.equals("End")){

            double minimumBudget = Double.parseDouble(sc.nextLine());

            double availableMoney = 0;

            while (availableMoney < minimumBudget){

                double savedMoney = Double.parseDouble(sc.nextLine());
                availableMoney += savedMoney;
            }
            System.out.printf("Going to %s!\n", destination);

            destination = sc.nextLine();
        }
    }
}
