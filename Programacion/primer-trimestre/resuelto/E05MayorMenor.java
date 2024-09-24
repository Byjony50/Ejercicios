/*	Programa que llene un array de 50 elementos con numeros enteros de dos digitos.
 * Mostrar el array (20 numeros por linea)
 * Buscardentro del array el mayor y el menor de los numeros y:
 * 		-Intercambiar el mayor con el de la ultima posicion del array
 * 		-intercambiar el menor con el de la primera posicion del array
 * volver a mostrar el array(20 numeros por linea
 */

import java.util.Random;

public class E05MayorMenor {

	public static void main(String[] args) {
		// VARIABLES
		int[] array1 = new int [50];
		int mayor, menor;
		int indicaMay = 0, indicaMen = 0;

		//	FUNCIONES
		Random random = new Random();

		//llenar el array con 50 numeros aleatoriamente generados.
		for (int i = 0; i < array1.length; i++) {
			array1[i]= random.nextInt(90) + 10;
		}
		//mostrar el array (20 numeros por linea)
		System.out.println("Estos son los numeros generados aleatoriamente");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] +" ");
			if ((i + 1) %20 == 0 ) {
				System.out.println();
			}
		}

		mayor = array1[0];
		menor = array1[0];
		for (int i=0; i < array1.length;i++) {
			if (array1[i] > mayor) {
				mayor = array1[i];
				indicaMay = i;
			}
			if (array1[i] < menor) {
				menor =array1[i];
				indicaMen = i;
			}
		}
		int cambio = array1 [array1.length - 1];
		array1[array1.length - 1] = mayor;
		array1[indicaMay] = cambio;

		cambio = array1[0];
		array1[0] = menor;
		array1[indicaMen] = cambio;

		System.out.println();
        System.out.println("Contenido del array después del intercambio:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            if ((i + 1) % 20 == 0) {  
                System.out.println();
            }
        }
		
	}

}
