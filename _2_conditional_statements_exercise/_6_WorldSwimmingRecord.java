package _2_conditional_statements_exercise;

import java.util.Scanner;

public class _6_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        На конзолата се въвежда рекордът в секунди,  който Иван трябва да подобри,
//        разстоянието в метри, което трябва да преплува и времето в секунди, за което плува разстояние
//        от 1 м. Да се напише програма, която изчислява дали се е справил със задачата, като се има предвид,
//        че: съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди. Когато се изчислява колко пъти
//        Иван ще се забави, в резултат на съпротивлението на водата, резултатът трябва да се закръгли надолу до
//        най-близкото цяло число.

        double seconds = Double.parseDouble(sc.nextLine());
        double meters = Double.parseDouble(sc.nextLine());
        double secondsPeerMeter = Double.parseDouble(sc.nextLine());

        double swimming = meters * secondsPeerMeter;

        double slowlyMeters = Math.floor(meters / 15) * 12.5;

        double total = swimming + slowlyMeters;

        if(seconds > total){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", total);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", total - seconds);
        }
    }
}
