/* PROGRAMA QUE LEA NUMERIS ENTEROS POR TECLADO HASTA QUE SE TECLEE EL 0.
 * EN ESE MOMENTO EL PROGRAMA MOSTRARA POR PANTALLA EL MAYOR Y EL MENOR
 * DE TODOS LOS INTRODUCIDOS.
 * Ejemplo:
 * 		Introduce un numero (0 para terminar): 153
 *		Introduce un numero (0 para terminar): 15
 * 		Introduce un numero (0 para terminar): 6
 * 		Introduce un numero (0 para terminar): 48
 * 		Introduce un numero (0 para terminar): 89
 * 		Introduce un numero (0 para terminar): 0
 *
 *		El mayor es 153 y el menor es 6
 */

import java.util.Scanner;

public class E013MayorMenor {

	public static void main(String[] args) {
		// declaracion de variables
		Scanner sc;
		int num;
		int mayor, menor;

		menor = Integer.MAX_VALUE;
		mayor = Integer.MIN_VALUE;


		sc=new Scanner(System.in);
		System.out.println("Hola en este programa vamos a reunir varios numeros y vamos a encontrar el mayor y el menos y los vamos a decir");
		//Introduccion de numeros
		do {
			System.out.println("Introduce un numero (0 para terminar): ");
			num=sc.nextInt();
			if (num != 0) {
				if (num > mayor) {
					mayor = num;
				}

				if (num < menor ) {
					menor = num;
				}


			}

		} while (num != 0);
		sc.close();
		//Si no se introduce ningun numero se mostrara el siguiente mensaje
		if (mayor == Integer.MIN_VALUE && menor == Integer.MAX_VALUE ) {
			System.out.println("No has introducido ningun numero.");

		}

		System.out.println("El numero mayor es " +mayor +" y el menor es " +menor +".");

	}

}
 