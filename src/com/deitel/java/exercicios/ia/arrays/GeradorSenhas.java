package com.deitel.java.exercicios.ia.arrays;

public class GeradorSenhas {

	// Simule a geração de 50 senhas de 8 caracteres. As senhas devem ser compostas
	// por letras e números.
	// Use um array para contar quantas vezes cada um dos 10 dígitos (0-9) aparece
	// nas senhas geradas.

	public static void main(String[] args) {

		int[] intervalo = new int[36];

		// insere no array os numero de zero a nove
		for (int i = 0; i < 10; i++) {
			intervalo[i] = i;
		}

		// insere no array os números que representam o alfabeto minusculo da tabela
		// ASCII
		int numCount = 97;// representa a letra 'a' da tabela ASCII

		for (int i = 10; i < intervalo.length; i++) {
			intervalo[i] = numCount;
			numCount++;
		}

		// array para armazenar a quantidade de vezes que os numeros de 0 a 9 aparece na
		// senha
		int[] quantidadeNumero = new int[10];

		// intervalo correspondente ao tamanho da array
		int min = 0;
		int max = 35;

		// loop para gerar as 50 senhas
		for (int i = 1; i <= 50; i++) {

			// gera a senha alfanumerica com 8 caracteres
			for (int j = 1; j <= 8; j++) {
				int numRandom = (int) (Math.random() * (max - min + 1) + min);
//			System.out.print(numRandom + " ");

				if (numRandom < 10) {
					++quantidadeNumero[numRandom];
					System.out.print(intervalo[numRandom]);
				} else {

					char letra = (char) intervalo[numRandom];
					System.out.print(letra);
				}
			}
			System.out.println();
		}


		// imprime a lista com a quantidade de numeros de zero a nove
		System.out.printf("%s%14s%n", "Número", "Frequência");
		for (int i = 0; i < quantidadeNumero.length; i++) {
			System.out.printf("%3d%12d%n", i, quantidadeNumero[i]);

		}

	}

}
