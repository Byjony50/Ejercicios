/* Programa que lea por teclado el numero de alumnos matriculados
 * A continuacion pedir la nota (entera) para cada alumno, numerandolos.
 * Finalmente el progrma calculara la nota media y el numero de aprobados
 * ejemplo:
 * 		Introduce el numero de alumnos (>0): -5
 * 		Introduce el numero de alumnos (>0): 6
 * 		Nota del alumno 1: 6
 * 		Nota del alumno 1: 7
 * 		Nota del alumno 1: 3
 * 		Nota del alumno 1: 9
 * 		Nota del alumno 1: 8
 * 		Nota del alumno 1: 4
 * 		el numero de aprobados es: 4
 * 		la nota media es: 6.17
 */

import java.util.Scanner;

public class E011NotaMedia {

	public static void main(String[] args) {
		// declaramos variables
		int numAlumnos;
		int nota;
		int alumnoscont;
		int contAprobados;
		double notaMedia;
		int notaFinal;
		Scanner sc;
		
		notaMedia=0;
		notaFinal=0;
		contAprobados=0;
		
		
		sc=new Scanner(System.in);
		do {
			System.out.println("Dime el numero de alumnos:");
			numAlumnos=sc.nextInt();
		} while (numAlumnos<=0);

		System.out.println("Ahora te voy a pedir las notas de cada alumno");


		for (alumnoscont = 1;alumnoscont <= numAlumnos;alumnoscont++) {
			do {
				System.out.println("Nota alumno " +alumnoscont +": ");
				nota=sc.nextInt();
			} while (nota<=0 || nota>=10);

			if (nota>=0) {
				notaFinal=notaFinal+nota;
				
			}
		
			if (nota>=5) {
				contAprobados++;
			}
			

		}
		sc.close();
		System.out.println("El numero de aprobados es : " +contAprobados);
		
		notaMedia= (double) notaFinal / numAlumnos;
		System.out.println("La nota media de la clase es: " +notaMedia );
	}

}
