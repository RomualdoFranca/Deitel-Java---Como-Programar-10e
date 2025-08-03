package com.deitel.java.capitulo07;

public class InitArray {

	public static void main(String[] args) {

		//Iniciando uma array  com os valores padrão zero
		int[] arrayZero = new int[10];
		
		System.out.printf("%s%8s%n", "Index", "Value");//titulos de coluna
		
		for (int i = 0; i < arrayZero.length; i++) {
			System.out.printf("%5d%8d%n", i, arrayZero[i]);
		}
	}

}
