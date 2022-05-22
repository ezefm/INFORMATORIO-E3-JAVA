/*
8.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
    {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/

import java.util.*;
public class Complementario8b {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su nombre y apellido: ");
        String nombreYapellido = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        String edad = sc.nextLine();

        System.out.println("¿Cúal es su dirección?");
        String direccion = sc.nextLine();

        System.out.println("¿De que ciudad es?");
        String ciudad = sc.nextLine();

        sc.close();

        Complementario8a Entrada1 = new Complementario8a(nombreYapellido, edad, direccion, ciudad);
        System.out.println(Entrada1);

    }
}
