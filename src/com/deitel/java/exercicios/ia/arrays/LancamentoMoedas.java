package com.deitel.java.exercicios.ia.arrays;

import java.security.SecureRandom;

public class LancamentoMoedas {

	/*Simule o lançamento de uma moeda 1000 vezes. Use um array de tamanho 2 para contar quantas vezes deu "cara"
    (índice 0) e quantas vezes deu "coroa" (índice 1).*/
	public static void main(String[] args) {

		SecureRandom random = new SecureRandom();
		int[] frequencia = new int[3];
		
		for (int count = 1; count <= 1000; count++) {
			int randomNumber = random.nextInt(2);
			++frequencia[1+ randomNumber];
		}
		
		System.out.printf("%s%8s%n", "Cara", "Coroa");
		System.out.printf("%3d%8d%n", frequencia[1], frequencia[2]);
	}

}
