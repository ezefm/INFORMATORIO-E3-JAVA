/*
2.	Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y
    otro al final. Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después
    de agregar a en la primera y última posición).
*/

import java.util.*;

public class Complementario2 {
    public static void main(String[] args) {

        Complementario2.generarListaRandom();
    }
    public static void generarListaRandom() {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();


        for (int i = 0; i < 5 ; i++) {
            enteros.add( (int) Math.round(Math.random()*100) );
        }

        int elementos = enteros.size();
        System.out.println(enteros);
        System.out.println("Su lista tiene:"+elementos+" elementos.");

        System.out.println("¿Que número desea agregar al final de la lista?");
        enteros.add(sc.nextInt());
        elementos = enteros.size();

        System.out.println(enteros);
        System.out.println("Su lista tiene:"+elementos+" elementos.");

        System.out.println("¿Que número desea agregar al inicio de la lista?");
        enteros.add(0, sc.nextInt());
        elementos = enteros.size();

        System.out.println(enteros);
        System.out.println("Su lista tiene:"+elementos+" elementos.");
    }
}
