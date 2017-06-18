package utils;

public class Taylor {

	public static double cos(double x, int n){
		

		double potencia = 1;
		double factorial = 1;
		double result = 1;
		int control = 2;

		for(int i=1 ; i<=(n*2) ; i++ ){
		
			potencia = potencia * x;
			factorial = factorial * i;
			
			if(i%2==0){		
				if(control%2==0){
				result = result - (potencia/factorial);
				control ++;
				}else{
				result = result + (potencia/factorial);
				control ++;
				}
			}
		
		}
	
		
		return result;
	}
	
}
