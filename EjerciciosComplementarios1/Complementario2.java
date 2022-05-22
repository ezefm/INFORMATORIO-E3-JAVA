// 2. Realizar un programa que solicite por consola 2 números enteros.
// Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división)
// de ambos números.

import java.util.Scanner;
public class Complementario2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número: ");
        int num1 = sc.nextInt();
        System.out.println("Escriba otro número: ");
        int num2 = sc.nextInt();
        sc.close();


        System.out.println("La suma de los numeros es: "+ (num1+num2));
        System.out.println("La resta de los numeros es: "+ (num1-num2));
        System.out.println("La multiplicación de los numeros es: "+ (num1*num2));
        System.out.println("La división de los numeros es: "+ ((float) num1 / (float) num2));
        System.out.println("El módulo de los numeros es: "+ ((float) num1 % (float) num2));
    }
}
