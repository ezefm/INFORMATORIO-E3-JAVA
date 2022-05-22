//3.Confeccionar un programa que dado un número entero como dato de entrada
//  imprima la secuencia de números (incrementos de 1)

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Complementario3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero del 1 al 10: ");
        int num = sc.nextInt();
        sc.close();
        List<Integer> list = new ArrayList<>();
        String str = "";

        for (int i = 1; i <= num; i++) {
            str += i;
            System.out.println(str);

        }
        for (int i = 1; i <= num; i++) {
            list.add(i);
            System.out.println((list+"Prueba en lista"));
        }
    }
}
