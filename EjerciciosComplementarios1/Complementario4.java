/*
4.	Realizar un programa que calcule la factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.
*/


import java.util.Scanner;
public class Complementario4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        int factorial = sc.nextInt();
        sc.close();
        int factorialx = 1;

        for (int i = 1; i <= factorial; i++) {
            factorialx *= i;
        }
        if (factorial < 1) {
            System.out.println(" Error :) ");
        } else {
            System.out.println("Factorial de " + factorial + " es: " + factorialx);
        }
    }
}
