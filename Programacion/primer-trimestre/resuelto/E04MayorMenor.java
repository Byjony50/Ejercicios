/*PROGRAMA QUE LEA DOS NUMEROS ENTEROS POR TECLADO Y LOS MUESTRE POR PANTALLA 
 * ORDENADOS DE MAYOR A MENOR
 * Ejemplo:
 * 	    Introduce numero : x
 * 		Introduce oreo numero: x2
 * 		Los numeros ordenados son: x x2
 */

import java.util.Scanner;

public class E04MayorMenor {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		int num1, num2;
		int mayor, menor;
		Scanner sc;

		//LEER VALORES POR TECLADO
		sc=new Scanner(System.in);
		System.out.println("Hola, aqui vamos a ordenar los numeros de mayor a menor, ahora te pedire varios numeros");
		System.out.println("Dime un numero al azar: ");
		num1=sc.nextInt();
		System.out.println("Ahora dime otro mas: ");
		num2=sc.nextInt();
		sc.close();
		//MOSTRAR POR PANTALLA LOS VALORES LEIDOS
		System.out.println("Estos son los dos numeros que has elegido: " +"A="+num1 +" y " +"B="+num2);
		System.out.println("Ahora los ordenaremos de mayor a menor");

		//ORDENAR DE MAYOR A MENOR
		if(num1>num2) {
			mayor=num1;
			menor=num2;
			System.out.println("Este seria el orden de tus numeros: " +menor +" , " +mayor );
		} else {
			mayor=num2;
			menor=num1;
			System.out.println("Este seria el orden de tus numeros: " +menor +" , " +mayor );
		}

	}




}
