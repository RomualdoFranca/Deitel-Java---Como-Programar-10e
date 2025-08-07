package com.deitel.java.exercicios.ia.arrays;

import java.security.SecureRandom;

public class AnaliseNotas {

	/*
	 * Receba 20 notas de alunos (de 0 a 10) e use um array para contar quantas vezes cada nota foi atribuída.
    Imprima um resumo mostrando quantas notas 0, quantas notas 1, etc., foram dadas.
*/
	
	public static void main(String[] args) {

		SecureRandom secureRandon = new SecureRandom();
		int[] frequenciaNotas = new int[11];
		
		//loop para adicionar as 20 notas
		for (int count = 1; count <= 20; count++) {
			int randonNumber = secureRandon.nextInt(11);//gera numero aleatorio entre 0 e 10
			++frequenciaNotas[randonNumber];
		}
		
		for (int i = 0; i < frequenciaNotas.length; i++) {
			System.out.printf("%s%15s%n", "Notas", "Frequência");
			System.out.printf("%3d%13d%n", i, frequenciaNotas[i]);
		}
	}

}
