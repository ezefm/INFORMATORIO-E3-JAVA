/*
3.	Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores,
    no figuras). Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar
    (mezclar) el arrayList y volver a imprimir.

    ArrayList implementa la interface Collection, existe algún método que me permita hacer la operación sort (mezclar)
    aleatoriamente? Idem para el reverso
*/

import java.util.ArrayList;
import java.util.Collections;

public class Complementario3 {
    public static void main(String[] args) {

        String[][] cartas = new String[4][13];
        ArrayList<Object> cartasDesordenadas = new ArrayList<>();

        cartas[0][0] = "As de Picas";
        cartas[0][1] = "2 de Picas";
        cartas[0][2] = "3 de Picas";
        cartas[0][3] = "4 de Picas";
        cartas[0][4] = "5 de Picas";
        cartas[0][5] = "6 de Picas";
        cartas[0][6] = "7 de Picas";
        cartas[0][7] = "8 de Picas";
        cartas[0][8] = "9 de Picas";
        cartas[0][9] = "10 de Picas";
        cartas[0][10] = "Sota de Picas";
        cartas[0][11] = "Dama de Picas";
        cartas[0][12] = "Rey de Picas";

        cartas[1][0] = "As de Corazones";
        cartas[1][1] = "2 de Corazones";
        cartas[1][2] = "3 de Corazones";
        cartas[1][3] = "4 de Corazones";
        cartas[1][4] = "5 de Corazones";
        cartas[1][5] = "6 de Corazones";
        cartas[1][6] = "7 de Corazones";
        cartas[1][7] = "8 de Corazones";
        cartas[1][8] = "9 de Corazones";
        cartas[1][9] = "10 de Corazones";
        cartas[1][10] = "Sota de Corazones";
        cartas[1][11] = "Dama de Corazones";
        cartas[1][12] = "Rey de Corazones";

        cartas[2][0] = "As de Trebol";
        cartas[2][1] = "2 de Trebol";
        cartas[2][2] = "3 de Trebol";
        cartas[2][3] = "4 de Trebol";
        cartas[2][4] = "5 de Trebol";
        cartas[2][5] = "6 de Trebol";
        cartas[2][6] = "7 de Trebol";
        cartas[2][7] = "8 de Trebol";
        cartas[2][8] = "9 de Trebol";
        cartas[2][9] = "10 de Trebol";
        cartas[2][10] = "Sota de Trebol";
        cartas[2][11] = "Dama de Trebol";
        cartas[2][12] = "Rey de Trebol";

        cartas[3][0] = "As de Diamante";
        cartas[3][1] = "2 de Diamante";
        cartas[3][2] = "3 de Diamante";
        cartas[3][3] = "4 de Diamante";
        cartas[3][4] = "5 de Diamante";
        cartas[3][5] = "6 de Diamante";
        cartas[3][6] = "7 de Diamante";
        cartas[3][7] = "8 de Diamante";
        cartas[3][8] = "9 de Diamante";
        cartas[3][9] = "10 de Diamante";
        cartas[3][10] = "Sota de Diamante";
        cartas[3][11] = "Dama de Diamante";
        cartas[3][12] = "Rey de Diamante";

        System.out.println("--------------Imprime baraja---------------");
        for(int i = 0; i < 4; i++) {

            for (int k = 0; k < 13; k++) {
                cartasDesordenadas.add(cartas[i][k]);
                System.out.println(cartas[i][k]);
            }
        }
        System.out.println("------------Imprime baraja inversa------------");
        for (int i = cartas.length-1 ; i > 0; i--) {

            for (int k = 12; k >= 0; k--) {
                System.out.println(cartas[i][k]);
            }
        }
        System.out.println("------------Imprime baraja al azar-------------");
        Collections.shuffle(cartasDesordenadas);
        for (Object cartasDesordenada : cartasDesordenadas) {
            System.out.println(cartasDesordenada);
        }
    }
}

