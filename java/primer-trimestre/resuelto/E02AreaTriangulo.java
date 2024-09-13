/*PROGRAMA QUE LEA POR TECLADO EL VALOR DE LA BASE Y EL VALOR DE LA ALTURA Y 
 *	MUESTRE POR PANTALLA EL VALOR DEL AREA DE ESE TRIANGULO
 */

import java.util.Scanner;

public class E02AreaTriangulo {

	public static void main(String[] args) {
		// DECLARACION DE VARIABLES
		float base, altura, area;
		Scanner sc;

		//PETICION DE DATOS POR TECLADO
		sc=new Scanner(System.in);
		System.out.println("Hola buenas vamos a calcular el area de un triangulo");
		System.out.println("Necesitaria que me dijeras la base del triangulo que quieras calcular: ");
		base=sc.nextFloat();
		System.out.println("Ahora necesito la altura del triangulo: ");
		altura=sc.nextFloat();
		sc.close();
		
		
		//CALCULAR Y MOSTRAR RESULTADO
		if(base<0 || altura<0) {
			System.out.println("Error al calcular el area, por que la base o la atura son negativas");
		}else {
			
			area=(base*altura)/2;
			System.out.println("El resultado es: "+area);

		}
	}

}