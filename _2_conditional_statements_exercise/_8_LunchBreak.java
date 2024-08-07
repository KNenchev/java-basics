package _2_conditional_statements_exercise;

import java.util.Scanner;

public class _8_LunchBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        По време на почивката отделяте време за обяд и време за отдих. Времето за обяд ще бъде 1/8 от
//        времето за почивка, а времето за отдих ще бъде 1/4 от времето за почивка.

        String serialName = sc.nextLine();
        int episodeTime = Integer.parseInt(sc.nextLine());
        int breakTime = Integer.parseInt(sc.nextLine());

        double lunchTime = breakTime / 8.0 ;
        double peaceTime = breakTime / 4.0 ;


        double totalTime = breakTime - lunchTime - peaceTime;
        if(totalTime >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(totalTime  - episodeTime));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName , Math.ceil(episodeTime - totalTime));
        }
    }
}
