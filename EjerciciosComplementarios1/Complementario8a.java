/*
8.	Crear una aplicación que solicite de entrada los datos de una persona en este orden:
    Nombre y Apellido
    Edad
    Dirección
    Ciudad
    Luego imprimirá el siguiente mensaje:
{   Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/

public class Complementario8a {

    String nombreYapellido;
    String edad;
    String direccion;
    String ciudad;

    public Complementario8a(String nombreYapellido, String edad, String direccion, String ciudad) {
        this.nombreYapellido = nombreYapellido;
        this.edad = edad;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    @Override
    public String toString () {
        return  ("{"+this.ciudad+"}") + " - " +
                ("{"+this.direccion+"}") + " - " +
                ("{"+this.edad+"}") + " - " +
                ("{"+this.nombreYapellido+"}");
    }
}
