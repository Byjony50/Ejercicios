/*PROGRAMA QUE LEA UNA NOTA NUMERICA ENTERA ENTRE 0 Y 10 Y MUESTRE
 * POR PANTALLA SU CORRESPONDIENTE VALOR EN FORMA DE TEXTO SEGUN LA TABLA:
 * 0<=nota<3 - MD - OG
 * 4<=nota<5 - INS - GU
 * 5<=nota<6 - SUF - NAH
 * 6<=nota<7 - BN - ON
 * 7<=nota<9 - NT - OO
 * 9<=nota<10 - SB -BK
 */

import java.util.Scanner;

public class E05Notas {

	public static void main(String[] args) {
		// LEER VALORES POR TECLADO
		int nota;
		Scanner sc;
		
		//LEER VALORES POR TECLADO
		sc=new Scanner(System.in);
		System.out.println("Hola, dime la nota que has sacado por favor: ");
		nota=sc.nextInt();
		
		sc.close();
		//AHORA CALCULAREMOS LA NOTA CON UN SWITCH Y LO MOSTTREREMOS POR PANTALLA LA NOTA
		
		switch (nota) {
		case 0:
			System.out.println("Tu nota es: 0=Mediocre");
			break;
		case 1:
			System.out.println("Tu nota es: 1=Mediocre");
			break;
		case 2:
			System.out.println("Tu nota es: 2=Mediocre");
			break;
		case 3:
			System.out.println("Tu nota es: 3=Insuficiente");
			
		case 4:
			System.out.println("Tu nota es: 4=Insuficiente");
			break;
		case 5:
			System.out.println("Tu nota es: 5=Suficiente");
			break;
		case 6:
			System.out.println("Tu nota es: 6=Bien");
			break;
		case 7:
			System.out.println("Tu nota es: 7=Muy bien");
			break;
		case 8:
			System.out.println("Tu nota es: 8=Muy bien");
			break;
		case 9:
			System.out.println("Tu nota es: 9=Sobresaliente");
			break;
		case 10:
			System.out.println("Tu nota es: 10=Sobresaliente");
			break;
		default:
			System.out.println("Este valor no es valido: ERROR");
			break;
		}
	}

}
