package com.deitel.java.exercicios.ia.arrays;

public class SorteioLoteria {

	// Simule 10 sorteios de um jogo de loteria com 6 números de 1 a 60. Use um
	// array para contar quantas vezes
	// cada número foi sorteado e imprima os 5 números mais frequentes.
	public static void main(String[] args) {

		// intervalo dos numeros que podem ser sorteados
		int min = 1;
		int max = 60;

		int[] frequenciaNumerica = new int[61];// array que armazena a frequencia em que os numeros aparecem
		int numeroSorteado = 0;
		
		for (int i = 1; i <= 10; i++) {//o loop externo realiza os 10 sorteios
			for (int j = 1; j<= 6; j++) {
				numeroSorteado = (int) (Math.random() * (max - min + 1) + min);
				++frequenciaNumerica[numeroSorteado];
				System.out.print(numeroSorteado + " ");
			}
			System.out.println("\n____________________\n");
			
		}
		
		System.out.printf("\n%s%15s" , "Números do Sorteio","Frequência");
		for (int i = 0; i < frequenciaNumerica.length; i++) {
			System.out.printf("\n%10d%18d%n" ,i, frequenciaNumerica[i]);
		}

	}

}
