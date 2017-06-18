package utils;

public class Magia {
	
	
	public static void aleatorio(int array[][], int length){
		
		int aleatorio;
		boolean igual = false;
		
		//Relleno la matriz de -1 para evitar lentitud en la comparación del valor aleatorio (no puede salir negativo en el random)
		//Pero como un array o matriz declarado los valores son 0, evitamos que encuentra el valor 0 como repetido.
		for(int i=0;i<3;i++){
			for(int j=0;j<7;j++){
				array[i][j]=-1;
			}
		}
		
		//La matriz la lleno de valores aleatorios del número de nuestra baraja, números únicos!
		for(int i=0;i<3;i++){
			for(int j=0;j<7;j++){
			igual = false;
			aleatorio = (int) (Math.random()*length);
					for(int k=i;k>=0;k--){
						for(int l=0;l<7;l++){
							if(array[k][l]==aleatorio){
								igual = true;
								continue;
							}
						}
					}
					if(igual==false){
						array[i][j]=aleatorio;
					}else{
						j--;
					}
			}
		}
		
	}
	
	public static void baraja21(int array1[][],int select){
		int array2[][] = new int[3][7];
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
		
	}

}
