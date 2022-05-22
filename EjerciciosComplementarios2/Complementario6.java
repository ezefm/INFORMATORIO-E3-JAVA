/*
6.	Se dispone de una lista de Empleados, de cada empleado se conoce:
○	Nombre y Apellido
○	DNI
○	horasTrabajadas
○	valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora)
de toda esa lista para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value)
es el sueldo calculado.
*/
import java.util.*;
public class Complementario6 {

    public static void main(String[] args) {

        HashSet<Empleado> empleado = new HashSet<>();
        HashMap<Integer, Float> salario = new HashMap<>();

        empleado.add(new Empleado("Montiel Fernando", 40031837, 6, 200));
        empleado.add(new Empleado("Soto Marina", 39852453, 5, 500));
        empleado.add(new Empleado("Nayeli Nayla", 25486021, 8, 450));
        empleado.add(new Empleado("Juric Ana", 50254963, 8, 200));
        empleado.add(new Empleado("Bobadilla Elias", 35684445, 8, 300));

        System.out.println("Calculo del salario de los empleados");

        for (Empleado lista : empleado) {
            System.out.println(lista.nombre + " - DNI "
                    + lista.dni + " - Horas de trabajo: "
                    + lista.horasTrabajadas
                    + " - Valor por hora: " + lista.valorPorHora);
        }
        for (Empleado crearUnaTabla : empleado) {
            salario.put(crearUnaTabla.clave(), crearUnaTabla.valor());
        }
        System.out.println("\nSalario percibido:\n");
        salario.forEach((dni, valor) -> System.out.println("DNI: " + dni + " - Salario: " + valor));
    }
}
class Empleado {
    String nombre;
    int dni;
    float horasTrabajadas;
    float valorPorHora;

    public Empleado(String nombre, int dni, float horasTrabajadas, float valorPorHora) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }
    public int clave() {
        return this.dni;
    }
    public float valor() {
        return this.horasTrabajadas * this.valorPorHora;
    }
}
