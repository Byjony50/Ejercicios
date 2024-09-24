/*	Programa que llene un array de 8 elementos con numeros enteros introducidos por teclado
 * Una vez lleno, mostramos el contenido del array, primero en orden normal (del
 * primero al ultimo) y luego en orden invertido (del ultimo al primero)
 */


import java.util.Scanner;

public class E01Array1 {
	public static int TAM=8 ;

	public static void main(String[] args) {
		// declaracion de variables

		int[] numeros;
		int pos;
		int nums;
		Scanner sc;
		numeros=new int[TAM];
		sc=new Scanner(System.in);


		System.out.println("Hola, vas a decirme 8 numeros despues de este mensaje 1 por 1");
		for (pos=0;pos<numeros.length;pos++) {
			System.out.println("Numero " + (pos	+ 1) +": ");
			numeros[pos] = sc.nextInt();
		}
		System.out.println("Orden ascendente");
		for (nums=0;nums<numeros.length;nums++) {
			System.out.println(numeros[nums]);
		}
		System.out.println();
		System.out.println("Orden descendente");
		for (nums=numeros.length-1;nums>=0;nums--) {
			System.out.println(numeros[nums]);
		}
		sc.close();
	}

}
