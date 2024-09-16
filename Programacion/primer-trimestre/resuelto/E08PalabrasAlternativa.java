import java.util.Scanner;

public class E08PalabrasAlternativa {

	public static void main(String[] args) {
		//DEFINICION DE VARIABLES 
		String palabra;
		int num;
		int cont;
		Scanner sc;
		
		//Leemos la palabra y el numero
		sc=new Scanner(System.in);
		System.out.println("Hola, en este programa vamos a leer una palabra y luego un "
				+ "numero que le indiques y mostrara la palabra segun el numero");
		System.out.println("dime una palabra: ");
		palabra=sc.nextLine();
		
		//Ahora miramos si el numero es positivo sino que se repita hasta que el numero sea positivo
		do {
			System.out.println("Repite el numero otra vez: ");
			num=sc.nextInt();
			} while (num<=0);
		
		cont=1;
		while (cont<=num) {
			System.out.println(palabra);
			cont++;
		}
		
		/*Otra alternativa con un for:
		 * 
		 * for(cont=1;cont<=num;cont++) {
		 * 		System.ot.printIn(palabra);
		 * }
		 */
		sc.close();

	}

}
