/*	TENEMOS UN ARRAY DE NUMEROS ENTEROS DE 8 FILAS Y 10 COLUMNAS.
 * llenar el array con numeros aleatorios positivos de 2 digitos
 * mostrar el array por filas numeradas del 1 al 8
 * pedir al usuario los numeros de dos filas del array
 * controlanto que las dos filas existan
 * 
 * Intercambiamos el contenido de las dos filas
 * 
 * volver a mostrar el array
 * EJ:
 * FILA 1: 22 25 26 27 24 20 23 25 35 35
 * FILA 2: 22 25 26 27 24 20 23 25 35 35
 * FILA 3: 22 25 26 27 24 20 23 25 35 35
 * FILA 4: 22 25 26 27 24 20 23 25 35 35
 * FILA 5: 22 25 26 27 24 20 23 25 35 35
 * FILA 6: 22 25 26 27 24 20 23 25 35 35
 * FILA 7: 45 35 46 57 64 70 83 95 55 65
 * FILA 8: 22 25 26 27 24 20 23 25 35 35
 */

import java.util.Random;
import java.util.Scanner;


public class E09Filararray {

	public static void main(String[] args) {
		//variables y funciones
		int fila1, fila2;
		int[][] array = new int[8][10];
		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		// Llenar el array con números aleatorios positivos de 2 dígitos
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = random.nextInt(90) + 10;  
			}
		}

		// Mostrar el array
		System.out.println("Array inicial:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("FILA " + (i + 1) + ": ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}


		// Pedir al usuario las dos filas que quiere intercambiar
		do {
			System.out.print("\nIntroduce el número de la primera fila a intercambiar (1-8): ");
			fila1 = sc.nextInt();
			System.out.print("Introduce el número de la segunda fila a intercambiar (1-8): ");
			fila2 = sc.nextInt();
		} while (fila1 < 1 || fila1 > 8 || fila2 < 1 || fila2 > 8 || fila1 == fila2);

		// Intercambiar el contenido de las dos filas 
		for(int i=0;i<array[0].length;i++) {
			int aux=array[fila1-1][1];
			array[fila1-1][i]=array[fila2-1][i];
			array[fila2-1][i]=aux;
		}



		// Volver a mostrar el array después del intercambio
		System.out.println("\nArray después del intercambio:");
		for (int i = 0; i < array.length; i++) {
			System.out.print("FILA " + (i + 1) + ": ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

			 
		sc.close();
	}
}





