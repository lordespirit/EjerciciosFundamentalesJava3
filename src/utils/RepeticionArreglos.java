package utils;

public class RepeticionArreglos {

	/**
	 * Este programa recibe dos arreglos de char para evaluar
	 * cuantas veces el primer arreglo se repite en el segundo
	 * @param array1 Primer array
	 * @param array2 Seguno array
	 * @return Devuelve un entero que es el número de veces que se ha repetido
	 */
	public static int reps(char[] array1, char[] array2){
		
		int repeticiones = 0;
		//int lenght_array1 = array1.length;
		//int lenght_array2 = array2.length;
		boolean si = false;
		
		for(int i=0;i<array2.length;i++){
		
			if(array1[0]==(array2[i])){
				
				for(int j=0,k=i;j<array1.length;j++,k++){
					
					if(array1[j]==array2[k]){
						si = true;
					}else{
						si = false;
						break;
					}
					
				}
				if(si==true){
					repeticiones++;
				}
				
			}
		}
		
		return repeticiones;
			
	}
	
}
