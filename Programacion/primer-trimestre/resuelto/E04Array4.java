import java.util.Random;

public class E04Array4 {

    public static void main(String[] args) {
        // VARIABLES
        int[] array1 = new int[50];
        int[] array2 = new int[25];
        int index = 0;  

        // Funciones
        Random random = new Random();

        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(201) - 100;  
        }

       
        System.out.println("Contenido del primer array:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
            if ((i + 1) % 20 == 0) {  
                System.out.println();
            }
        }

         
        for (int i = array1.length - 1; i >= 0; i -= 2) {  
            array2[index] = array1[i]; 
            index++;
        }

       
        System.out.println("\nContenido del segundo array (elementos de posiciones pares en orden descendente):");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
            if ((i + 1) % 10 == 0) {  
                System.out.println();
            }
        }
    }
}
