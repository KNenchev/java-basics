package _3_conditional_statements_advanced_exercise;

import java.util.Scanner;

public class _9_SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = Integer.parseInt(sc.nextLine()) - 1;
        String typeOfPlace = sc.nextLine();
        String feedback = sc.nextLine();

        double price = 0;

        if(typeOfPlace.equals("room for one person")){
            price = days * 18;
        }else if(typeOfPlace.equals("apartment")){
            price = days * 25.0;
            if (days < 10){
                price = price * 0.70;
            } else if (days > 10 && days <= 15 ) {
                price = price * 0.65;
            }else{
                price = price * 0.50;
            }
        }else if(typeOfPlace.equals("president apartment")){
            price = days * 35.0;
            if (days < 10){
                price = price * 0.90;
            } else if (days > 10 && days <= 15 ) {
                price = price * 0.85;
            }else{
                price = price * 0.80;
            }
        }

        if(feedback.equals("positive")){
            price = price * 1.25;
        }else{
            price = price * 0.90;
        }

        System.out.printf("%.2f", price);
    }
}
