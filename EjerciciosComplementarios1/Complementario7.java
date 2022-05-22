/*
7.	Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas.
    Sin uso de métodos o librerías que realicen toUppercase().
*/

import java.util.Scanner;
public class Complementario7 {

    static void changecase() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        sc.close();

        for(int i = 0; i < frase.length(); i++) {
            int change = frase.charAt(i);
            if(change > 64 && change < 91) {
                change = change + 32;
                System.out.print( (char) change);
            } else if (change > 96 && change < 123) {
                change = change - 32;
                System.out.print( (char) change);
            }
            if(change == 32)
                System.out.print(" ");
        }
    }
    public static void main (String[] args) {

        char abc = 32;
        System.out.println(abc);
        Complementario7.changecase();
    }
}