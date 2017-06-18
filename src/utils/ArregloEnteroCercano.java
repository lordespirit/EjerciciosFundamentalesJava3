package utils;

public class ArregloEnteroCercano {
	
	public static int cercano(int arreglo[], int entero){
		int control = Math.abs(entero - arreglo[0]);
		int cercano=0;
		for(int i=1;i<arreglo.length;i++){
		
			
			if((Math.abs(entero - arreglo[i]))<control){
				control = Math.abs(entero - arreglo[i]);
				cercano = arreglo[i];
			}
		
		}
		
		return cercano;
	}

}
