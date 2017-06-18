package main;

import java.util.Random;

import utils.Input;

public class Ej4_1_MagiaBaraja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Baraja
		/* String baraja[] = {
				"E1","E2","E3","E4","E5","E6","E7","E10","E11","E12",
				"C1","C2","C3","C4","C5","C6","C7","C10","C11","C12",
				"O1","O2","O3","O4","O5","O6","O7","O10","O11","O12",
				"B1","B2","B3","B4","B5","B6","B7","B10","B11","B12",
				};
		
		*/
		
		int array1[][] = {{1,2,3,4,5,6,7},{8,9,10,11,12,13,14},{15,16,17,18,19,20,21}};		
		// array de [3][7]
		
		for(int i=0;i<array1.length;i++){
				System.out.print("Fila " + (i+1) + ":\t|");
			for(int j=0;j<array1[i].length;j++){
				System.out.print(array1[i][j] + "|\t|");
			}			
			System.out.print("\n");
			
		}
		
		int array2[][] = new int[3][7];
		int veces=1;
		
		do{
		
		System.out.print("En que fila se encuentra el array : ");
		int select = Input.scannInt();
		
		
		
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
			
			for(int i=0;i<array2.length;i++){
				System.out.print("Fila " + (i+1) + ":\t|");
			for(int j=0;j<array2[i].length;j++){
				System.out.print(array2[i][j] + "|\t|");
			}			
			System.out.print("\n");
			}
			
			veces++;
			
		}while(veces<=3);
		
		
		System.out.println("La carta que pensabas era : " + array2[1][3]);
		
				
	}

}
