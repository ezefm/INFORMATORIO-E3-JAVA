/*
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los valores que NO sean null o vacío ("").
Input (Entrada):
List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
Output (Salida):
        ["Hola", "Informatorio"]
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        Stream<String> streamPalabras = palabras.stream().filter(x -> (!Objects.equals(x, "") && x != null));
        System.out.print(streamPalabras.toList());
    }
}