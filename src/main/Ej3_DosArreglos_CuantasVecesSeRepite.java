package main;

import utils.Input;
import utils.RepeticionArreglos;

public class Ej3_DosArreglos_CuantasVecesSeRepite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un string1 : ");
		String string1 = Input.scannLine();
		System.out.println("Introduce un string2 : ");
		String string2 = Input.scannLine();
		
		char sch1[] = string1.toCharArray();
		char sch2[] = string2.toCharArray();
		
		int repeticiones = RepeticionArreglos.reps(sch1, sch2);
		
		System.out.println("Los chars del array1 se repite/n " + repeticiones + " "
				+ "vez/veces en el array2");
		
	}

}
