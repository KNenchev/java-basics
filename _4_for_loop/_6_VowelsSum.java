package _4_for_loop;

import java.util.Scanner;

public class _6_VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++){
            switch (text.charAt(i)){
            case 'a': sum += 1; break;
            case 'e': sum += 2; break;
            case 'i': sum += 3; break;
            case 'o': sum += 4; break;
            case 'u': sum += 5; break;
            }
        }
        System.out.println(sum);
    }
}
