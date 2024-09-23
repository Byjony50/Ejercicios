/*	LLENAR UN ARRAY DE 100 ELEMENTOS CON NUMEROS ENTEROS POSITIVOS 
 * ALEATORIOS DE DOS DIGITOS
 */

import java.util.Random;

public class E03Aleatoios {

	public static void main(String[] args) {
		// variables
		int[] numeros; 
		numeros= new int[100];
		int i;
		int suma = 0;
		int contarPares = 0;

		//funciones
		Random random = new Random();

		// Genera un número entre 10 y 99 aleatoriamente sin continuidad
		for ( i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(90) + 10;  
		}


		//muestra por pantalla los numeros que se han generado aleatoriamente anteriormente
		for ( i = 1; i <= numeros.length; i++) {
			System.out.print(numeros[i-1] + " ");
			if((i+1)%15==0 ) {
				System.out.println();
			}

		}
		System.out.println();
		//SUMAR, CONTAR Y MOSTRAR POR PANTALLA (8 elementos por linea) LOS ELEMENTOS PARES 
		//DE LAS POSICIONES IMPARES INDICANDO LOS ELEMENTOS LAS POSICIONESDE ESOS NUMEROS
		/*LAS NUMEROS SON: (?)54 (?)98 (?)34 (?)14 (?)32 (?)56 
		 * HAY: x NUMEROS
		 * LA SUMA ES: x
		 */
		
		
	       System.out.println("Los números pares en posiciones impares son:");
	        
	        for (i = 1; i < numeros.length; i += 2) {  
	            if (numeros[i] % 2 == 0) { 
	                System.out.print("(Posicion " + i + ") " + numeros[i] + " ");
	                suma += numeros[i];  
	                contarPares++;  
	                if (contarPares % 8 == 0) {
	                    System.out.println();  
	                }
	            }
	        }
	        System.out.println();
	        System.out.println("Hay: " + contarPares + " números.");
	        System.out.println("La suma es: " + suma);
	}

}