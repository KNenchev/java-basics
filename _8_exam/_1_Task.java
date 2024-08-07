package _8_exam;

import java.util.Scanner;

public class _1_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double processorPrice = Double.parseDouble(sc.nextLine()) ;
        double videoCardPrice = Double.parseDouble(sc.nextLine());
        double ramPrice = Double.parseDouble(sc.nextLine()) ;
        int ramQuantity = Integer.parseInt(sc.nextLine());
        double discount = Double.parseDouble(sc.nextLine());

        //цените да се обърнат в лева, като приемем, че 1 долар = 1.57 лева.
        processorPrice = processorPrice * 1.57;
        videoCardPrice = videoCardPrice * 1.57;
        ramPrice = (ramPrice * 1.57) * ramQuantity;

        double discountCpu = processorPrice * discount;
        double discountGpu = videoCardPrice * discount;

        double totalAll = (processorPrice - discountCpu) + (videoCardPrice - discountGpu) + ramPrice;

        System.out.printf("Money needed - %.2f leva.", totalAll);


    }
}
