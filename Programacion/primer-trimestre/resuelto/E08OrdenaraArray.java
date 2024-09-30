/*	Llenar un array de 10 elementos con numeros enteros positivos entre 1 y 50.
 * Mostrar el array
 * Ordenarlo por el metodo de la burbuja
 * volver a mostrarlo ya ordenado
 * 
 */

import java.util.Random;

public class E08OrdenaraArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       int[] array = new int[10];
	       
	       Random random = new Random();
	       
	       
	        for (int i = 0; i < array.length; i++) {
	        	array[i] = random.nextInt(50) + 1;
	        	
	        }
	        
	        
	        System.out.println("Array original:");
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        
	        int n = array.length;
	        boolean cambio;

	        for (int i = 0; i < n - 1; i++) {
	            cambio = false;

	            for (int j = 0; j < n - i - 1; j++) {
	                if (array[j] > array[j + 1]) {
	                    
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                    cambio = true; 
	                }
	            }


	            if (!cambio) break;
	        }
	        
	        
	       
	       
	}

}
