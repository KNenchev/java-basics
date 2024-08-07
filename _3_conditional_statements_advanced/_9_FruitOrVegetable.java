package _3_conditional_statements_advanced;

import java.util.Scanner;

public class _9_FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();

//        if(product.equals("banana") || product.equals("apple") || product.equals("kiwi") || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")){
//            System.out.println("fruit");
//        }else if (product.equals("tomato") || product.equals("cucumber") || product.equals("pepper") || product.equals("carrot")) {
//            System.out.println("vegetable");
//        }else {
//            System.out.println("unknown");
//        }

        switch (product){
            case "banana" :
            case "apple" :
            case "kiwi" :
            case "cherry" :
            case "lemon" :
            case "grapes" : System.out.println("fruit"); break;
            case "tomato" :
            case "cucumber" :
            case "pepper" :
            case "carrot" : System.out.println("vegetable"); break;
            default: System.out.println("unknown"); break;
        }
    }
}
