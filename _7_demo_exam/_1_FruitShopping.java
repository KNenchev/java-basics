package _7_demo_exam;

import java.util.Scanner;

public class _1_FruitShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double strawberryPrice = Double.parseDouble(sc.nextLine());
        double bananaKg = Double.parseDouble(sc.nextLine());
        double orangeKg = Double.parseDouble(sc.nextLine());
        double raspberriesKg = Double.parseDouble(sc.nextLine());
        double strawberryKg = Double.parseDouble(sc.nextLine());


        //• цената на малините е на половина по-ниска от тази на ягодите;
        double raspberriesPrice = strawberryPrice * 0.50;
        //• цената на бананите е с 80% по-ниска от цената на малините.
        double bananaPrice = raspberriesPrice * 0.20 ;
        //• цената на портокалите е с 40% по-ниска от цената на малините;
        double orangePrice = raspberriesPrice * 0.60;

        double sPrice = strawberryPrice * strawberryKg;
        double rPrice = raspberriesPrice * raspberriesKg;
        double bPrice = bananaPrice * bananaKg;
        double oPrice = orangePrice * orangeKg;

        double totalAll = sPrice + rPrice + bPrice + oPrice;

        System.out.printf("%.2f", totalAll);
    }
}
