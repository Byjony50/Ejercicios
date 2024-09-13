/*Programa que lea un numero entero por teclado, lo almacene en una variable y muestre por pantalla el valor de la mitad de ese numero
 * 
 */
import java.util.Scanner;

public class E01HolaMundo {

	public static void main(String[] args) {
		//DECLARACION DE VARIABLES
		int num;
		float res;
		Scanner sc;
		
		//Mostrar mensajes
		System.out.println("Hola Mundo");
		//LEER DESDE EL TECLADO
		sc=new Scanner(System.in);
		
		System.out.print("Introduce un numero entero por teclado:");
		num=sc.nextInt();
		
		sc.close();
		res=(float)num/2;
		System.out.println("El resultado es: "+res);
		
	}

}
