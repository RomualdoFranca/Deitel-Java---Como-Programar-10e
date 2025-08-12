package com.deitel.java.exercicios.ia.arrays;

public class GeradorSenhas {

	//Simule a geração de 50 senhas de 8 caracteres. As senhas devem ser compostas por letras e números.
    //Use um array para contar quantas vezes cada um dos 10 dígitos (0-9) aparece nas senhas geradas.
	
	public static void main(String[] args) {

		
		// Explicação da fórmula:
		// (max - min + 1) -> Define o tamanho do intervalo. Por exemplo, de 97 a 122, são 25 números.
		// Math.random() * (max - min + 1) -> Gera um double entre 97.0 e 121.99999...
		// (int) -> Converte o double para um inteiro, truncando as casas decimais.
		// + min -> Desloca o resultado para começar a partir do 'min'.
		
			
		int[] intervalo = new int[36];
		
		
		//insere no array os numero de zero a nove
		for (int i = 0; i < 10; i++) {
			intervalo[i] = i;
		}
		
		//insere no array os números que representam o alfabeto minusculo da tabela ASCII
		int numCount = 97;//representa a letra 'a' da tabela ASCII
		
		for (int i = 10; i < intervalo.length; i++) {
			intervalo[i] = numCount;
			numCount++;
		}
		
		//imprime a lista
//		for (int i : intervalo) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
		
		//intervalo correspondente ao tamanho da array
		double min = 0;
		double max = 35;
		
		//gera a senha alfanumerica com 8 caracteres
		for (int i = 1; i <= 8; i++) {
			int numRandom = (int) (Math.random() * (max - min + 1) + min);
//			System.out.print(numRandom + " ");
			
			if(numRandom < 10) {
//				intervalo[i] = numRandom;
				System.out.print(intervalo[numRandom]);
			}else {
				
				char letra = (char) intervalo[numRandom];
				System.out.print(letra);
			}
		}
		System.out.println("\n______________________________________");
//		for (int i : intervalo) {
//			System.out.print(i + " ");
//		}
		
		
		
		
		
		
		
	}

}
