/*PROGRAMA QUE LEA DOS NUMEROS ENTEROS POR TECLADO Y LOS GUARDE EN DOS VARIABLES.
 * MOSTRAR POR PANTALLA EL VALOR DE LAS DOS VARIABLES.
 * A CONTINUACION EL PROGRAMA INTERCAMIBARA EL VALOR DE LAS DOS VARIABLES ENTRE SI.
 * MOSTRAR DE NUEVO EL VALOR DE LAS DOS  VARIABLES
 */
import java.util.Scanner;

public class E03Intercambio {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		int caja1, caja2;
		Scanner sc;
		//LEER VALORES POR TECLADO
		sc=new Scanner(System.in);
		System.out.println("Hola buenas este programa guarda dos numeros que le digas al azar. ");
		System.out.println("Me podrias decir el primer numero que quisieras que guardaria: ");
		caja1=sc.nextInt();
		System.out.println("Ahora me podrias dar otro numero diferente al azar: ");
		caja2=sc.nextInt();
		sc.close();
		//MOSTRAR POR PANTALLA LOS VALORES LEIDOS
		System.out.println("Estos son los dos numeros que has elegido: " +"A="+caja1 +" y " +"B="+caja2);
		System.out.println("Ahora haremos un intercamibo en los numeros.");
		//INTERCAMBIOS
		caja1=caja2;
		caja2=caja1;
		//VOLVER A MOSTRARLOS POR PANTALLA
		System.out.println("El intercambio esta hecho");


}

}
