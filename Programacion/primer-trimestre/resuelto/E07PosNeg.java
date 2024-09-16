/*PROGRAMA QUE LEA POR TECLADO 15 NUMEROS ENTEROS Y MUESTRE POR 
 * PANTALLA UN MENSAJE INDICADO CUANTOS POSITIVOS, CUANTOS 
 * NEGATIVOS Y CUANTOS VALORES NULOS (0) SE HAN INTRODUCIDO.
 * 
 * Ejemplo:
 * 		Introduce 15 numeros enteros por teclado:
 * 		Num 1: 251
 * 		num 2: 26
 * 		Num 3: -25
 * 		........
 * 		Num 15: -362
 * 
 * 		Has introducido 7 positivos, 4 negativos y 4 valores 0
 */

import java.util.Scanner;

public class E07PosNeg {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		int contador;
		int numeros;
		int contPosi;
		int contNega;
		int val0;
		Scanner sc;
		
		
		//Leer valores por mensaje
		sc=new Scanner(System.in);
		System.out.println("Hola en este programa vamos a contar 15 numeros y te vamos a decir cuantos son: positivos, negativos, y valor 0.");
		val0=0;
		contNega=0;
		contPosi=0;
		contador=1;
		while (contador<=15) {
			System.out.println("Dime el numero " +contador +": " );
			numeros=sc.nextInt();
			contador=contador+1;
			
			if (numeros>0) {
				contPosi=contPosi+1;
			}
			
			if (numeros<0) {
				contNega=contNega+1;
			}
			
			if (numeros==0) {
				val0=val0+1;
			}
		}
		sc.close();
		//Damos cuantos positivos, negativos y valores 0 ahi.
		System.out.println("Has introducido: " +contPosi +"positivos, " +contNega+" negativos" +" y " +val0 +" valores0" );

	}

}
