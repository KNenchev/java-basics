package _4_for_loop;

import java.util.Scanner;

public class _5_CharacterSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

//        for(int i = 0; i < word.length(); i ++){
//            System.out.println(word.charAt(i));
//        }
        for (char input : word.toCharArray()) {
            System.out.println(input);
        }
    }
}
