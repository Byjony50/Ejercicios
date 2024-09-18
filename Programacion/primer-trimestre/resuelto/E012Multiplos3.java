/*LEER UN NUMERO POR TECLADO Y MOSTRAR POR PANTALLA LOS MULTIPLOS DE 3 QUE HAY
 *  ENTRE 1 Y ESE NUMERO
 *  por ejemplo:
 *  		Introduce un numero: 29
 *  		Los multiplos de 3 entre 1 y 29 son:
 *  			3 6 9 12 15 18 21 24 27.
 */

import java.util.Scanner;

public class E012Multiplos3 {

	public static void main(String[] args) {
		// Declaracion de variables
		Scanner sc;
		int num;
		int multiplo;

		sc=new Scanner(System.in);
		System.out.println("hola en este programa sacaremos los multiplos de tres del numero que hayas elegido: ");
		System.out.println("A continuacion dime el numero que quieras: ");
		num=sc.nextInt();
		sc.close();

		System.out.println("Los multiplos de 3 entre 1  y " +num +" son:");
		for (multiplo= 1;multiplo <= num; multiplo++) {
			if (multiplo %3 == 0) {
				System.out.print(+multiplo +", ");
			}
		}


	}

}
