/*
Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la letra B
(tanto mayúscula como minúscula, en ese caso decimos que será ignoreCase).

Input (Entrada):
List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac",);

Output (Salida):
3
*/
import java.util.List;
import java.util.stream.Stream;

public class Stream3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Stream<String> palabrasDos = palabras.stream()
                .filter(x -> x.startsWith("B") || x.startsWith("b"));
        System.out.print(palabrasDos.toList().size());
    }
}
