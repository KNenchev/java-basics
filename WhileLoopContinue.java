import java.util.Scanner;

public class WhileLoopContinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i  = 0;

        while (i < 10){
            if (i % 2 == 0){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
