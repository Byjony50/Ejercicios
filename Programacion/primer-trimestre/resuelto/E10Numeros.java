/*PROGRAM QUE LEA DOS NUMEROS POR TECLADO Y MUESTRE LOS NUMEROS 
 * COMPENDIDOS ENTRE LOS DOS DE FORMA ASCENDENTE, AMBOS INCLUIDOS, QUE SOLO MUESTRE 15 NUMEROS POR LINEA
 * Ejemplo:
 * 		Intorduce un numero: 15
 * 		Introduce un numero: 7
 * 		Los numeros entre 7 y 15son:
 * 		7 8 9 10 11 12 13 14 15
 */

import java.util.Scanner;

public class E10Numeros {

    public static void main(String[] args) {
        // Declaración de variables
        int num1;
        int num2;
        int contador;
        int contadorLineas;
        Scanner sc;

        // Petición de números
        System.out.println("En este programa me tendrás que decir dos números, da igual "
                + "el orden, y te diré todos los números que hay entre ellos dos.");
        sc = new Scanner(System.in);
        System.out.println("Dime el primer número: ");
        num1 = sc.nextInt();
        System.out.println("Dime el segundo número: ");
        num2 = sc.nextInt();
        sc.close();

        
        contadorLineas = 0;

        if (num1 < num2) {
            System.out.println("Los números entre " + num1 + " y " + num2 + " son: ");
            for (contador = num1; contador <= num2; contador++) {
                System.out.print(contador + " ");
                contadorLineas++;

                if (contadorLineas % 15 == 0) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("Los números entre " + num2 + " y " + num1 + " son: ");
            for (contador = num2; contador <= num1; contador++) {
                System.out.print(contador + " ");
                contadorLineas++;

                if (contadorLineas % 15 == 0) {
                    System.out.println();
                }
            }
        }


        if (contadorLineas % 15 != 0) {
            System.out.println();
        }
    }
}





