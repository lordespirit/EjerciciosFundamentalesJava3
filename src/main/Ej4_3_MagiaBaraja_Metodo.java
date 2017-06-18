package main;

import utils.Input;
import utils.Magia;

public class Ej4_3_MagiaBaraja_Metodo {

	public static void main(String[] args) {

		String baraja[] = {
				"1 Espadas","2 Espadas","3 Espadas","4 Espadas","5 Espadas","6 Espadas","7 Espadas","10 Espadas","11 Espadas","12 Espadas",
				"1 Copas","2 Copas","3 Copas","4 Copas","5 Copas","6 Copas","7 Copas","10 Copas","11 Copas","12 Copas",
				"1 Oros","2 Oros","3 Oros","4 Oros","5 Oros","6 Oros","7 Oros","10 Oros","11 Oros","12 Oros",
				"1 Bastos","2 Bastos","3 Bastos","4 Bastos","5 Bastos","6 Bastos","7 Bastos","10 Bastos","11 Bastos","12 Bastos",
				};
		// array de [3][7]
		int array1[][] = new int[3][7];
		int length = baraja.length;
		//LLamamos a nuestro metodo 'aleatorio' dentro de la clase Magia.
		
		Magia.aleatorio(array1,length);
		
		// Muestro por primera vez la matriz de 3x7 con los valores pero apuntando a la baraja
		
	
		
		//Aquí empezamos a preguntar al usuario (3 veces) en que fila se encuentra. Y declaramos otro array como control.
		int veces=1;
		
		do{
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			for(int i=0;i<array1.length;i++){
					System.out.print("| Fila " + (i+1) + ":\t|");
				for(int j=0;j<array1[i].length;j++){
					System.out.print(baraja[array1[i][j]] + "|\t|");				
				}			
				System.out.print("\n");
				
			}
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("En que fila se encuentra tu carta : ");
		
			int select = Input.scannInt();
			Magia.baraja21(array1, select);
			veces++;
			
		}while(veces<=3);
		
		// Una vez hechas las 3 iteraciones, se muestra la carta de la posición 11 (en este caso, posición media de la matriz, posición media del array [1][3])
		System.out.println("******************************************");
		System.out.println("** La carta que pensabas era : " + baraja[array1[1][3]] + " **");
		System.out.println("******************************************");
		
	}

}
