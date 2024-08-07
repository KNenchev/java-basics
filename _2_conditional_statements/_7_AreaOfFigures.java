package _2_conditional_statements;

import java.util.Scanner;

public class _7_AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        double area = 0;

            // with if else statement
//        if (input.equals("square")){
//            double side = Double.parseDouble(sc.nextLine());
//            area = side * side;
//        } else if (input.equals("rectangle")) {
//            double sideA = Double.parseDouble(sc.nextLine());
//            double sideB = Double.parseDouble(sc.nextLine());
//            area = sideA * sideB;
//        } else if (input.equals("circle")) {
//            double side = Double.parseDouble(sc.nextLine());
//            area = side * side * Math.PI;
//        }else if (input.equals("triangle")) {
//            double sideA = Double.parseDouble(sc.nextLine());
//            double sideB = Double.parseDouble(sc.nextLine());
//            area = sideA * sideB / 2;
//        }
//        System.out.printf("%.3f", area);

        // with switch cases
        switch (input) {
            case "square" -> {
                double side = Double.parseDouble(sc.nextLine());
                area = side * side;
            }
            case "rectangle" -> {
                double sideA = Double.parseDouble(sc.nextLine());
                double sideB = Double.parseDouble(sc.nextLine());
                area = sideA * sideB;
            }
            case "circle" -> {
                double side = Double.parseDouble(sc.nextLine());
                area = side * side * Math.PI;
            }
            case "triangle" -> {
                double sideA = Double.parseDouble(sc.nextLine());
                double sideB = Double.parseDouble(sc.nextLine());
                area = sideA * sideB / 2;
            }
        }
        System.out.printf("%.3f", area);
    }
}
