package _6_nested_loop;

public class _1_Clock {
    public static void main(String[] args) {

        for(int hours = 0; hours <= 23 ; hours++){

            for (int min = 0; min <= 59; min++){

                System.out.println(hours + ":" + min);
            }
        }
    }
}
