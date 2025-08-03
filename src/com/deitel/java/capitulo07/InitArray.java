package com.deitel.java.capitulo07;

public class InitArray {

	public static void main(String[] args) {

		// Iniciando uma array com os valores padrão zero
		int[] arrayZero = new int[10];

		geraSaidaArray(arrayZero);
		// A lista de inicializador especifica o valor inicial de cada elemento
		int[] arrayComInicializador = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
		geraSaidaArray(arrayComInicializador);
		
		//declara constante
		final int ARRAY_LENGTH = 10;
		int[] arrayEvenNumbers = new int[ARRAY_LENGTH];
		
		for (int i = 0; i < arrayEvenNumbers.length; i++) {
			arrayEvenNumbers[i] = 2 + 2 * i;
		}
		
		System.out.println("Even array");
		geraSaidaArray(arrayEvenNumbers);
		
		
		//caculando a soma dos elementos de uma array
		int[] arraySum = {87, 68 , 94, 100, 83 , 78, 85, 91 , 76, 87};
		int total = 0;
		
		for (int i = 0; i < arraySum.length; i++) {
			total += arraySum[i];
		}
		System.out.println("Soma total do elementos: " + total);
		
	}// fim do main

	
	public static void geraSaidaArray(int[] array) {
		System.out.printf("%s%8s%n", "Index", "Value");// titulos de coluna

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
		System.out.println("_____________________");
	}

}//fim da classe InitArray



