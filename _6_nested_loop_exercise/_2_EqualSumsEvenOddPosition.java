package _6_nested_loop_exercise;

import java.util.Scanner;

public class _2_EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        for (int i = n1; i <= n2 ; i++) { // диапазона n1 -> n2.
            String firstN = String.valueOf(i); // преобразуваме инт към стринг -> защото искаме да работим с неговите позиции а не със самото число

            int even = 0;
            int ood = 0;

            // втория for цикъл е за позициите на числото
            for (int j = 0; j < firstN.length() ; j++) { // j < -> защото броенето започва от 0 1 2 а не от 1 2 3
                int currentDigN = Integer.parseInt(firstN.charAt(j) + ""); // преобразуваме от char към инт, защото за да вземем позицията на дадено число
                // трябва първо да използваме char за да определим неговата позиция и след това да го преобразуваме към int, за да го използваме в if-а по долу.
                // Пример: ако firstN e "10000" , трябва да вземем всяка позиция на този стринг, да проверим четна или нечетна е после да го преобразуваме в инт
                // и да го добавим към even или ood;

                if (j % 2 == 0){
                    even+= currentDigN;
                }else {
                    ood+= currentDigN;
                }
            }
            if (even == ood){
                System.out.print(i + " ");
            }
        }
    }
}
