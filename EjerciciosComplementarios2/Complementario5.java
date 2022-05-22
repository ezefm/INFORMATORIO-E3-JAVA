/*
5.	Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas
semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
Input (Entrada):
[6, 7, 8, 4, 5]
[350, 345, 550, 600, 320]

## Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.
Output (Salida):
[2100, 2415, 4400, 2400, 1600]
Total Final: $ 12915
*/

import java.util.ArrayList;
import java.util.List;

public class Complementario5 {
    public static void main(String[] args) {

        List <Integer> horasTrabajadas = new ArrayList<>();
        List <Integer> valorPorHora = new ArrayList<>();
        List <Integer> total = new ArrayList<>();
        int montoFinal = 0;

        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
        valorPorHora.add(350);
        valorPorHora.add(345);
        valorPorHora.add(550);
        valorPorHora.add(600);
        valorPorHora.add(320);

        for (int i = 0; i < horasTrabajadas.size(); i++) {
            int horas = horasTrabajadas.get(i) * valorPorHora.get(i);
            montoFinal = montoFinal + horas;
            total.add(horas);
        }
        System.out.println(total);
        System.out.println("Total final: $"+montoFinal);
    }
}
