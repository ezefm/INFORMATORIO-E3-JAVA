/*
Dada una lista que contiene números enteros, se deberá generar otra lista que contendrá el resultado de aplicar la
operación de potencia a 2.

Input (Entrada):
List<Integer> palabras = List.of(1, 2, 3, 4, 5);

Output (Salida):
[1, 4, 9, 16, 25]
*/
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1,2,3,4,5);
        Stream<Integer> palabrasDos = palabras.stream()
                .map(x -> (int) Math.pow(x, 2));
        System.out.print(palabrasDos.toList());
    }
}
