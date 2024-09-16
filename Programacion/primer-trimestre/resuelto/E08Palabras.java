/*PROGRAMA QUE LEA POR TECLADO UNA PALABRA Y UN NUMERO Y MUESTRE 
 * POR PANTALLA LA PALABRA LEIDA TANTAS VECES COMO INDIQUE EL 
 * NUMERO. SI EL NUMERO ES NEGATIVO EL PROGRAMA VOLVERA A PEDIR EL NUMERO HASTA QUE SEA POSITIVO
 * Ejemplo:
 * 		Introduce una palabra: Hola
 * 		Introduce un numero (>0): -6 
 * 		Introduce un numero (>0): -5
 * 		Introduce un numero (>0): -9
 * 		Introduce un numero (>0): 4
 * 		Hola
 * 		Hola
 * 		Hola
 * 		Hola
 */


import java.util.Scanner;

public class E08Palabras {

	public static void main(String[] args) {
		//DEFINICION DE VARIABLES 
		String palabra;
		int num;
		Scanner sc;
		
		//Leemos la palabra y el numero
		sc=new Scanner(System.in);
		System.out.println("Hola, en este programa vamos a leer una palabra y luego un "
				+ "numero que le indiques y mostrara la palabra segun el numero");
		System.out.println("dime una palabra: ");
		palabra=sc.nextLine();
		System.out.println("dime un numero: ");
		num=sc.nextInt();
		
		//Ahora miramos si el numero es positivo sino que se repita hasta que el numero sea positivo
		while (num<=0) {
			System.out.println("Repite el numero otra vez: ");
			num=sc.nextInt();
			

			}
		while (num>0) {
			System.out.println(palabra);
			num=num-1;
		}
		sc.close();
	}

}
