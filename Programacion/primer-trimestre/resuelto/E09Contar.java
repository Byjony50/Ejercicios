/* PROGRAMA QUE MUESTRE POR PANTALLA LOS NUMEROS DEL 1 AL 50 EN UNA LINEA
 * DESPUES LOS MUESTRE DEL 50 AL 1 EN UNA LINEA SEPARADOS POR UN ESPACIO
 */



public class E09Contar {

	public static void main(String[] args) {
		// INICIALIZAR LAS VARIABLES
		int cont;

		//EXPLICACION DE LO QUE HACE
		System.out.println("Hola este programa te lee los numeros del 1 al 50 y despues del 50 al 1: ");

		//CUENTA DEL 1 AL 50

		for (cont=1;cont<=50;cont++) {
			System.out.print(cont +", ");
			if (cont %10==0) {
				System.out.println();
			}
		}
		//Salto de linea
		System.out.println();

		//CUENTA DEL 50 AL 1

		for (cont=50;cont>=1;cont--) {
			System.out.print(cont +", ");
			if (cont %10==1) {
				System.out.println();
			}
		}

	}


}

