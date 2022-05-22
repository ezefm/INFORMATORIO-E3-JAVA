/*
1.Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking.
*/
import java.util.*;
public class Complementario1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ciudadesFavoritas = new ArrayList<>();
        System.out.print("¿Con cuantas ciudades desea armar el ranking?: ");
        String ciudades = sc.nextLine();
        int nCiudades =  Integer.parseInt(ciudades);
        for(int i = 1; i <= nCiudades; i++){
            System.out.print("Ingrese su ciudad favorita número " + i+": ");
            ciudadesFavoritas.add("#"+i + " -> " + sc.nextLine());
        }
        System.out.println("Ciudades favoritas:");
        for (String ciudad : ciudadesFavoritas) {
            System.out.println(ciudad);
        }
    }
}