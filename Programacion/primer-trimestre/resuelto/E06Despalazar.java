/*LLENAR UN ARRAY DE 10 ELEMENTOS CON NUMEROS ENTEROS DE DOS DIGITOS.
 * Positivos y negativos.
 * mostrar el array.
 * Despalzar todos los elementos una posicion a la derecha, metiendo el elemento de la ultima posicion la primera.
 * volver a mostrar el mismo array con los elementos desplazados
 * 
 */


	import java.util.Random;

public class E06Despalazar {

	public static void main(String[] args) {
        // Declaración de variables
        int[] array = new int[10];

        // funciones
        Random random = new Random();
        //llenar el array de numeros aleatorios
        for (int i = 0; i < array.length; i++) {
            int numero = random.nextInt(180) - 89;  
            while (Math.abs(numero) < 10) {  
                numero = random.nextInt(180) - 89;
            }
            array[i] = numero;
        }

        // esto muestra el array original
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); 

        // esto desplaza los elementos una vez a la derecha
        int ultimoElemento = array[array.length - 1];  
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];  
        }
        array[0] = ultimoElemento;  

        //muestra el array de nuevo
        System.out.println("\nArray después del desplazamiento:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}