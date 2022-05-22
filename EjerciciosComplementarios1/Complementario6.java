/*
6.	Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
 */

import java.util.Scanner;

public class Complementario6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int num = sc.nextInt();
        System.out.println("Ingrese exponente: ");
        int exp = sc.nextInt();

        sc.close();

        int res = 1;
        for (int i = 1;i <= exp; i++) {
            res = res*num;
        }
        System.out.println(num + " elevado a " + exp + " = " + res);
    }
}
