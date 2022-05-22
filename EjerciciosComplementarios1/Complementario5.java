/*  5.	Se desea una aplicación que solicite 2 números enteros y realice la operación
        de multiplicación por sumas sucesivas (sin uso de librerías).
*/

import java.util.Scanner;

public class Complementario5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número entero: ");
        int num2 = sc.nextInt();

        sc.close();
        int mult = 0;
        for (int i = 1; i <= num2; i++) {
            mult += num1;
        }
        System.out.println("Multiplicación mediante sumas sucesivas:"+mult);
    }
}
