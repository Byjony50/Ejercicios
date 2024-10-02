/*	Haz una funcion llamada factorial que reciba como parametro un numero entero positivo y devueva como double e l resultado
 * de ese factorial
 * 
 * desde el main:
 * Programa pricipal que lea un numero por teclado y mediante una llamada a la funcion factorial obtenga el factorial de ese
 * numero y muestre el resultado por pantalla
 */

import java.util.Scanner;

public class E02Factorial {

	public static void main(String[] args) {
		int numero;
		double total;
		Scanner sc;

		sc=new Scanner(System.in);


		System.out.print("Dame un numero para hacer el factorial: ");
		numero=sc.nextInt();
		total=factorial(numero);

		System.out.println("el resultado es: " +total);
		System.out.println();
		sc.close();
		
		
		System.out.println("Factoriales del 0 al 9:");
		for (int i = 0; i <= 9; i++) {
		    System.out.println("Factorial de " + i + ": " + factorial(i));
		}
		
		

	}

	static double factorial (int num) {
		//Declaracion de variables
		double res=num;

		if ( num == 0) {
			return 1;
		}
		for (int i=num-1;i>0;i--) {
			res=res*i;
		}
		return res;
	}
}
