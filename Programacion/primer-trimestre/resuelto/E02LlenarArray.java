/*LLENAR UN ARRAY DE 20 ELEMENTOS CON LOS PRIMEROS 20 NUMEROS MULTIPLOS DE 12
 * MOSTRAR LOS ELEMENTOS DE LA 8ª, LA 15ª Y LA 18ª POSICIONES
 */

public class E02LlenarArray {
	public static void main(String[] args) {
		//variables
		int[] multi = new int[20];
		int num;
		for ( num = 0; num < multi.length; num++) {
			multi[num] = (num + 1) * 12;
		}

		System.out.println("Elemento en posición 8: " + multi[7]);
		System.out.println("Elemento en posición 15: " + multi[14]);
		System.out.println("Elemento en posición 18: " + multi[17]);
	}
}
