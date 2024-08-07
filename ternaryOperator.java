import java.util.Scanner;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String msg = num >= 10 ? "Number is greater or equal to 10" : "Number is less than 10";

        System.out.println(msg);
    }
}
