/*	Adivinar en un maximo de intentos el numero aleatorio entre 1 y 1000
 *  "pensando" por el ordenador
 *  Intento 1 [1-1000]: 385
 *  Intento 2 [385-1000] 658
 *  Intento 3 [658-1000]: 865
 *  Intento 4 [658-865]: 
 */

import java.util.Random;
import java.util.Scanner;


public class E015Adivinar {

	public static void main(String[] args) {
		//Variables y funciones
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int numeroAdivinar = random.nextInt(1000) + 1;
		int intentosMaximos = 10; 
		int intentoActual = 0;
		int adivinanza;

		System.out.println("¡Adivina el número entre 1 y 1000! "); 
		System.out.println("Tienes " + intentosMaximos + " intentos.");

		// Bucle para los intentos
		while (intentoActual < intentosMaximos) {
			intentoActual++;
			System.out.print("Intento " + intentoActual + ": " );
			adivinanza = sc.nextInt();

			// Comparar el número adivinado con el número generado
			if (adivinanza == numeroAdivinar) {
				System.out.println("¡Felicidades! Has adivinado el número en " + intentoActual + " intentos.");
				break;
			} else if (adivinanza < numeroAdivinar) {
				System.out.println("El número es mayor.");
			} else {
				System.out.println("El número es menor.");
			}

			if (intentoActual == intentosMaximos) {
				System.out.println("Lo siento, has alcanzado el número máximo de intentos.");
				System.out.println("El número correcto era: " + numeroAdivinar);
			}
		}


		sc.close();

	}
}

