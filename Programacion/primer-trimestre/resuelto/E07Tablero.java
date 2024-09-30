/*	Crea un tablero de ajedrez. cada casilla tendra un char con una letra que indica el tipo de casilla.
 * llenalo con las fichas un posicion inicial.
 * para las casillas vacias metemos un mostrar en tablero (blancas arriba)
 */



public class E07Tablero {

	public static void main(String[] args) {
		// variables,  instancia.
		char[][] matriz = new char[8][8];

		matriz[0][0]=matriz[0][7]=matriz[7][0]=matriz[7][7]='T';
		matriz[0][1]=matriz[0][6]=matriz[7][1]=matriz[7][6]='C';
		matriz[0][2]=matriz[0][5]=matriz[7][2]=matriz[7][5]='A';
		matriz[0][3]=matriz[7][3]='R';
		matriz[0][4]=matriz[7][4]='Q';
		
		for(int i=1;i<2;i++ ) {
			for(int j=0;j<=7;j++) {
				matriz[1][j]='P';
			}
		}
		for(int i=6;i<7;i++ ) {
			for(int j=0;j<=7;j++) {
				matriz[6][j]='P';
			}
		}
		for (int i =2;i<6;i++) {
			for (int j=0;j<=7;j++) {
				matriz[i][j]='.';
			}
		}
		System.out.println("Blancas");
		for (int i= 0;i <matriz.length;i++) {
			for (int j= 0; j <matriz.length;j++) {
					System.out.print(matriz[i][j] +" ");	
			}
			System.out.println();
		}
		System.out.println("Negras");
		
		//Mover el peon blanco que esta delante de la reina dos posiciones adelante
		System.out.println("Mover el peon blanco dos casillas hacia adelante");
		
		matriz[1][4] = '.';
		matriz[3][4] = 'P';
		System.out.println("Blancas");
		for (int i = 0; i<matriz.length; i++) {
			for (int j = 0; j< matriz.length; j++) {
				System.out.print(matriz[i][j] +" ");
			}
			System.out.println();
		}
			System.out.println("Negras");
			
		//dar 180 grados al tablero
			System.out.println("Negras");
			
			
			for (int i = matriz.length-1; i >= 0 ; i--) {
				for ( int j = matriz.length-1; j >= 0;j--) {
					System.out.print(matriz[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Blancas");
	}

}
