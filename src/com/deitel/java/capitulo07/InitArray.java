package com.deitel.java.capitulo07;

import java.security.SecureRandom;

public class InitArray {

	public static void main(String[] args) {

//		// Iniciando uma array com os valores padrão zero
//		int[] arrayZero = new int[10];
//
//		geraSaidaArray(arrayZero);
//		// A lista de inicializador especifica o valor inicial de cada elemento
//		int[] arrayComInicializador = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
//		geraSaidaArray(arrayComInicializador);
//		
//		//declara constante
//		final int ARRAY_LENGTH = 10;
//		int[] arrayEvenNumbers = new int[ARRAY_LENGTH];
//		
//		for (int i = 0; i < arrayEvenNumbers.length; i++) {
//			arrayEvenNumbers[i] = 2 + 2 * i;
//		}
//		
//		System.out.println("Even array");
//		geraSaidaArray(arrayEvenNumbers);
//		
//		
//		//caculando a soma dos elementos de uma array
//		int[] arraySum = {87, 68 , 94, 100, 83 , 78, 85, 91 , 76, 87};
//		int total = 0;
//		
//		for (int i = 0; i < arraySum.length; i++) {
//			total += arraySum[i];
//		}
//		System.out.println("Soma total do elementos: " + total);
		
		//programa de jogo de dados
		SecureRandom randomNumbers = new SecureRandom();//gera numero aleatorio
		int[] frequecy = new int[7];//array de contadores de frequencia
		
		//lanca o dado 100 vezes: usa o valor do dado como indice de frequencia
		for (int roll = 1; roll <= 100; roll++) {
			int numRandon = randomNumbers.nextInt(6);
			System.out.println(numRandon);
			++frequecy[1 + numRandon];
		}
		
		
		
		
		
	}// fim do main

	
	public static void geraSaidaArray(int[] array) {
		System.out.printf("%s%8s%n", "Index", "Value");// titulos de coluna

		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
		System.out.println("_____________________");
	}

}//fim da classe InitArray



