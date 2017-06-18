package main;

import utils.Input;
import utils.Taylor;

public class Ej2_MetodoTaylorCoseno {

	public static void main(String[] args) {
		
		System.out.print("Introduce valor de operación x : ");
		double x = Input.scannDouble();
		System.out.print("\nIntroduce valor de iteraciones n : ");
		int n = Input.scannInt();
		
		System.out.println("\nSerie de Taylor para la función cos("+ x + "," + n + ") "
				+ "resultado = " + Taylor.cos(x, n)); 
		
	}

}
