import java.util.List;
import java.util.stream.Stream;
/*
Se dispone de una lista de Integer, de la cual queremos obtener otra lista aplicando la operación
de factorial pero no se desean valores repetidos.

Input (Entrada)
List<Integer> palabras = List.of(1, 2, 4, 4, 4);

Output (Salida):
[1, 2, 24]
*/
public class Stream4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        Stream<Integer> palabrasDos = palabras.stream().distinct().map(Stream4::factorial);
        System.out.println(palabrasDos.toList());
    }
    public static Integer factorial(int numero){
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}