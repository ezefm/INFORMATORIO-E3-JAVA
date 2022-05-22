/*
4.	Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList)
    e imprimir dichos cursos.
    Ayuda: ArrayList posee un método para particionar en sub-listas?
*/

import java.util.ArrayList;
import java.util.List;

public class Complementario4 {
    public static void main(String[] args) {
        ArrayList<Object> estudiantes = new ArrayList<>();

        estudiantes.add("Estudiante1");
        estudiantes.add("Estudiante2");
        estudiantes.add("Estudiante3");
        estudiantes.add("Estudiante4");
        estudiantes.add("Estudiante5");
        estudiantes.add("Estudiante6");
        estudiantes.add("Estudiante7");
        estudiantes.add("Estudiante8");
        estudiantes.add("Estudiante9");
        estudiantes.add("Estudiante10");
        estudiantes.add("Estudiante11");
        estudiantes.add("Estudiante12");

        List<Object> estudiantes1a = estudiantes.subList(0, 4);
        List<Object> estudiantes1b = estudiantes.subList(4, 8);
        List<Object> estudiantes1c = estudiantes.subList(8, 12);
        System.out.println("Estudiantes 1ro A:"+"\t"+estudiantes1a);
        System.out.println("Estudiantes 1ro B:"+"\t"+estudiantes1b);
        System.out.println("Estudiantes 1ro C:"+"\t"+estudiantes1c);
    }
}
