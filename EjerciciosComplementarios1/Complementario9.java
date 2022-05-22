/*
9.	Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
*/
import java.util.*;
public class Complementario9 {
    static void cantidadLetra() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        System.out.println("Ingrese una letra: ");
        String letra = sc.nextLine();

        sc.close();
        char myChar = letra.charAt(0);

        int cantidad = 0;
        char cnt;
        for (int i = 0; i < frase.length(); i++) {
            cnt = frase.charAt(i);
            if ( cnt == myChar) {
                cantidad ++ ;
            }
        }
        System.out.println(cantidad);
    }

    public static void main(String[] args) {
        Complementario9.cantidadLetra();
    }
}
