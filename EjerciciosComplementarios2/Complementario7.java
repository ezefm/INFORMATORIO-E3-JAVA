/*
7.	Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings.
    Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
    “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.

    Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar
    (no se incluye en el cálculo).
    Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4

    Input (Entrada):
    fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
    fizzBuzzFuncion(1,8)

    Output (Salida):
    [“1”, “Fizz”, “Buzz”, “Fizz”, 5]
    [“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
*/

import java.util.*;
import java.util.ArrayList;

public class Complementario7 {
    public static void main(String[] args) {

        ArrayList<String> uLista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro número: ");
        int num2 = sc.nextInt();

        sc.close();

        for (int i = num1; i < num2; i++) {
            if ( (num1 % 2) == 0 && (num1 % 3) == 0) {
                uLista.add(i + "-FizzBuzz");
                System.out.println(i + "-FizzBuzz");
            } else if ( (num1 % 3) == 0) {
                uLista.add(i + "-Buzz");
                System.out.println(i + "-Buzz");
            } else if ( (num1 % 2) == 0) {
                uLista.add(i + "-Fizz");
                System.out.println(i + "-Fizz");
            } else {
                uLista.add(i+" Número no multiplo");
            }
        }
        System.out.println(uLista);
    }
}
