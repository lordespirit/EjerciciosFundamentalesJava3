package main;

import utils.Input;
import utils.ArregloEnteroCercano;

public class Ej1_ArregloEnteros_Entero_NumeroMasCercano {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.print("Introduce tamaño de array: ");
		int length = Input.scannInt();
		
		int arreglo[] = new int[length];
		
		System.out.println("Rellena ahora el array de " + length + " posiciones.");
		
		for(int i=0; i<length; i++){
			
			System.out.print("Posicion " + (i+1) + " : ");
			arreglo[i] = Input.scannInt();
		}
		
		System.out.print("Introduce el entero : ");
		int entero = Input.scannInt();
		
		System.out.println("El más cercano es : " + ArregloEnteroCercano.cercano(arreglo, entero));

	}

}
