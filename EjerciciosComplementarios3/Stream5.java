import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Se posee una Lista con objetos de clase Alumno con los atributos: apellido, nombre y fechaDeNacimiento
(con tipos: String, String y LocalDate). Se desea generar un Map<String, Integer> donde la clave de Map será el
apellido concatenado con el nombre (con separador de espacio en blanco) y el value la edad del alumno.

La lista de entrada debe estar cargada con varios alumnos (al menos 5) para subir el ejemplo y demostrar su
funcionamiento.

En ejemplo se muestra solo con 1 Alumno a modo de abreviar.

En el ejemplo también se usa LocalDate.now().minusYears(30), en el ejercicio a presentar se deberá usar otra tecnica
de construcción para la fecha (no usar .now(). Pueden ver métodos .parse(), etc).

Input (Entrada)
List<Alumno> alumnos = List.of(new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)));

Output (Salida):
{"Simpson Homero"=30}
*/
public class Stream5 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Fernández de Kirchner",
                "Cristina Elisabet",
                LocalDate.of(1953,2,19));
        Alumno alumno2 = new Alumno("Macri",
                "Mauricio",
                LocalDate.of(1959,2,8));
        Alumno alumno3 = new Alumno("Fernández",
                "Alberto Ángel",
                LocalDate.of(1959,4,2));
        Alumno alumno4 = new Alumno("Milei",
                "Javier Gerardo",
                LocalDate.of(1970,8,22));
        Alumno alumno5 = new Alumno("Belgrano",
                "Manuel José",
                LocalDate.of(1770,6,3));

        List<Alumno> alumnos = List.of(alumno1, alumno2, alumno3, alumno4, alumno5);
        Map<String, Integer> alumnos2 = alumnos.stream()
                .collect(Collectors.toMap(Alumno::getNombreCompleto, Alumno::getEdad));
        System.out.println(alumnos2);
    }
    public static class Alumno{
        private String apellido;
        private String nombre;
        private LocalDate fechaDeNacimiento;

        public Alumno(String apellido, String nombre, LocalDate fechaDeNacimiento) {
            this.apellido = apellido;
            this.nombre = nombre;
            this.fechaDeNacimiento = fechaDeNacimiento;
        }
        public LocalDate getFechaDeNacimiento() {
            return fechaDeNacimiento;
        }

        public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
            this.fechaDeNacimiento = fechaDeNacimiento;
        }
        public String getNombreCompleto(){
            return nombre+" "+apellido;
        }
        public Integer getEdad(){
            Calendar calendar = Calendar.getInstance();
            Date calendar1 = calendar.getTime();
            LocalDate p1 = calendar1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate p2 = fechaDeNacimiento;
            Period period = Period.between(p2,p1);
            return period.getYears();
        }
    }
}