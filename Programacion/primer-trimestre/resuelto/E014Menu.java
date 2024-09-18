/* pROGRAMA QUE MUESTRE POR PANTALLA EL SIGUIENTE MENU DE OPCIONES
 *  1.- Sumar pares
 *  2.-Sumar impares
 *  3.-Sumar todos (Pares o Impares)
 *  4.-Fin de programa
 *  Teclea una opcion
 *  
 *  Para cada opcion elegida el programa leera numeros hasta que se teclee el -99
 *  momento en el que se mostrara el resultado de la opcion elegida, y nuestro
 *  programa volvera al menu.
 *  
 *  Ejemplo:
 *  1.- Sumar pares
 *  2.-Sumar impares
 *  3.-Sumar todos (Pares o Impares)
 *  4.-Fin de programa
 *  Teclea una opcion: 1
 *  Introduce un numero: 35
 *	Introduce un numero: 30
 *	Introduce un numero: 22
 *	Introduce un numero: -10
 *	Introduce un numero: 16
 *	Introduce un numero: -99
 *  La suma de todos los pares son = 58
 */

import java.util.Scanner;

public class E014Menu {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		char fin;
		int opcion;
		int numero;
		int resSuma;
		Scanner sc;

		;
		sc=new Scanner(System.in);

		System.out.println("En este programa vas a entrar en un menu, con varias opciones: ");

		do {
			System.out.println("1.- Sumar Pares");
			System.out.println("2.- Sumar Impares");
			System.out.println("3.- Sumar Todos (Pares e Impares)");
			System.out.println("4.- Fin de programa");
			System.out.println("Elegir opcion: ");
			opcion=sc.nextInt();
			resSuma=0;



			switch (opcion) {
			case 1:
				System.out.println("Has elegido la opcion 1 que es sumar pares, para finalizar la suma introduce (El numero -99):");
				do {
					System.out.println("Introduce un numero: ");
					numero=sc.nextInt();
					if (numero %2 == 0) {
						resSuma+=numero;
					}
				} while (numero != -99);
				System.out.println("El resultado de tu suma es: " +resSuma);
				break;

			case 2:
				System.out.println("Has elegido la opcion 2 que es sumar impares, para finalizar la suma introduce (El numero -99):");
				do {
					System.out.println("Introduce un numero: ");
					numero=sc.nextInt();
					if (numero!= -99 && numero %2 != 0) {
						resSuma+=numero;
					}
				} while (numero != -99);
				System.out.println("El resultado de tu suma es: " +resSuma);
				break;
			case 3:
				System.out.println("Has elegido la opcion 3 que es sumar pares e impares, para finalizar la suma introduce (El numero -99):");
				do {
					System.out.println("Introduce un numero: ");
					numero=sc.nextInt();
					if (numero != -99 ) {
						resSuma+=numero;
					}
				} while (numero != -99 );
				System.out.println("El resultado de tu suma es: " +resSuma);
				break;
			case 4:	
				System.out.println("Has elegido la opcion 4 finalizar programa,");
				System.out.println("estas seguro(S/N):");
				fin=sc.next().charAt(0);
				if (fin == 'S' || fin == 's') {
					System.out.println("Finalizando programa...");
					opcion=4;
				} else {
					System.out.println("Volviendo al menu");
					opcion=0;
				}
				break;
			}

		} while (opcion != 4);
		sc.close();
	}

}
