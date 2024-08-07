package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _3_AnimalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animal = sc.nextLine();

        if(animal.equals("dog")){
            System.out.println("mammal");
        } else if (animal.equals("crocodile") || animal.equals("tortoise") || animal.equals("snake")) {
            System.out.println("reptile");
        }else {
            System.out.println("unknown");
        }
    }
}
