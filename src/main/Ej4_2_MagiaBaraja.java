package main;

import java.util.Random;

import utils.Input;

public class Ej4_2_MagiaBaraja {

	public static void main(String[] args) {
		// Baraja espa�ola
		String baraja[] = {
				"1 Espadas","2 Espadas","3 Espadas","4 Espadas","5 Espadas","6 Espadas","7 Espadas","10 Espadas","11 Espadas","12 Espadas",
				"1 Copas","2 Copas","3 Copas","4 Copas","5 Copas","6 Copas","7 Copas","10 Copas","11 Copas","12 Copas",
				"1 Oros","2 Oros","3 Oros","4 Oros","5 Oros","6 Oros","7 Oros","10 Oros","11 Oros","12 Oros",
				"1 Bastos","2 Bastos","3 Bastos","4 Bastos","5 Bastos","6 Bastos","7 Bastos","10 Bastos","11 Bastos","12 Bastos",
				};
		// array de [3][7]
		int array1[][] = new int[3][7];
		int aleatorio;
		boolean igual = false;
		
		//Relleno la matriz de -1 para evitar lentitud en la comparaci�n del valor aleatorio (no puede salir negativo en el random)
		for(int i=0;i<3;i++){
			for(int j=0;j<7;j++){
				array1[i][j]=-1;
			}
		}
		
		//La matriz la lleno de valores aleatorios del n�mero de nuestra baraja, n�meros �nicos!
		for(int i=0;i<3;i++){
			for(int j=0;j<7;j++){
			igual = false;
			aleatorio = (int) (Math.random()*40);
					for(int k=i;k>=0;k--){
						for(int l=0;l<7;l++){
							if(array1[k][l]==aleatorio){
								igual = true;
								continue;
							}
						}
					}
					if(igual==false){
						array1[i][j]=aleatorio;
					}else{
						j--;
					}
			}
		}
		
		// Muestro por primera vez la matriz de 3x7 con los valores pero apuntando a la baraja
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		for(int i=0;i<array1.length;i++){
				System.out.print("| Fila " + (i+1) + ":\t|");
			for(int j=0;j<array1[i].length;j++){
				System.out.print(baraja[array1[i][j]] + "|\t|");				
			}			
			System.out.print("\n");
			
		}
		
		//Aqu� empezamos a preguntar al usuario (3 veces) en que fila se encuentra. Y declaramos otro array como control.
		int array2[][] = new int[3][7];
		int veces=1;
		
		do{
		System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
		System.out.print("En que fila se encuentra tu carta : ");
		
		int select = Input.scannInt();
		
		
		// Para la elecci�n de la fila, tenemos 3 condicionales 'if' y el control nos ayudar� a ordenadar empezando por una posici�n menor
		// menos que la seleccionada para as� que la segunda ordenaci�n sea la fila seleccionada.
			int k=6;
			int cont=0;
			
			if(select==1){
				cont=2;
				for(int i=0;i<7;i++){
					for(int j=0;j<3;j++){
						array2[j][i] = array1[cont][k];
						k--;
							if(k<0){
								k=6;
								cont++;
									if(cont>2){
										cont=0;
									}
							}
					}
				}
				
				for(int i=0;i<3;i++){
					for(int j=0;j<7;j++){
						array1[i][j]=array2[i][j];
					}
				}
				
			}else if(select==2){
				cont=0;
				for(int i=0;i<7;i++){
					for(int j=0;j<3;j++){
						array2[j][i] = array1[cont][k];
						k--;
							if(k<0){
								k=6;
								cont++;
									if(cont>2){
										cont=0;
									}
							}
					}
				}
				
				for(int i=0;i<3;i++){
					for(int j=0;j<7;j++){
						array1[i][j]=array2[i][j];
					}
				}
	
			}else if(select==3){
				cont=1;
				for(int i=0;i<7;i++){
					for(int j=0;j<3;j++){
						array2[j][i] = array1[cont][k];
						k--;
							if(k<0){
								k=6;
								cont++;
									if(cont>2){
										cont=0;
									}
							}
					}
				}
				
				for(int i=0;i<3;i++){
					for(int j=0;j<7;j++){
						array1[i][j]=array2[i][j];
					}
				}

			}
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
			for(int i=0;i<array2.length;i++){
				System.out.print("| Fila " + (i+1) + ":\t|");
			for(int j=0;j<array2[i].length;j++){
				System.out.print(baraja[array1[i][j]] + "|\t|");
			}			
			System.out.print("\n");
			}
			
			veces++;
			
		}while(veces<=3);
		
		// Una vez hechas las 3 iteraciones, se muestra la carta de la posici�n 11 (en este caso, posici�n media de la matriz, posici�n media del array [1][3])
		System.out.println("******************************************");
		System.out.println("** La carta que pensabas era : " + baraja[array2[1][3]] + " **");
		System.out.println("******************************************");
		
	}

}
