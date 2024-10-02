/*	Funcion que realice la suma de 3 numeros enteros recibidos como parametros y devuelva el resultado al main
 * 
 * 	Funcion que muestre por pantalla un numero de veces la frase "HOLA MUNDO"
 * 
 * DESDE EL PROGRAMA PRINCIPAL PEDIR UN NUMERO POR TECLADO Y, LLAMANDO A LA FUNCION, 
 * MOSTRAR ESE NUMERO DE VECES LA FRASE "HOLA MUNDO"
 */

import java.util.Scanner;

public class E01Suma {

	public static void main(String[] args) {
		// variables
		int result;
		int n1, n2, n3;
		int veces;
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Dime un numero");
		n1=sc.nextInt();
		System.out.println("Ahora dime otro numero");
		n2=sc.nextInt();
		System.out.println("Dime un ultimo numero");
		n3=sc.nextInt();
		System.out.println("Ahora se sumara todo y te dare el resultado");
	
		result=suma(n1, n2, n3);
		System.out.println("la suma es: " +result);
		
		System.out.println("Dime un numero de veces para escribir (holamundo)");
		veces=sc.nextInt();
		
		holaMundo(veces);
		
		
	}
	static int suma(int n1, int n2, int n3) {
		int result;
		result= n1+n2+n3;
		return result;
		
	}
	
	static void holaMundo(int veces) {
		
		
		for (int cont=0;cont<=veces;cont++) {
			System.out.println("Hola Mundo");
		}
	}
}
