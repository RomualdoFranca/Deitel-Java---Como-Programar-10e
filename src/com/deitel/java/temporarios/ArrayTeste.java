package com.deitel.java.temporarios;

public class ArrayTeste {

	public static void main(String[] args) {

		
		//array que armazena os numeros de zero a nove e os numeros correspondentes as letras minusculas da tabela ASCII
		int[] intervaloCompleto = new int[36];
		int numCount = 97;//numero que representa a letra 'a' da tabela ASCII
		
		for (int i = 0; i < intervaloCompleto.length; i++) {
			if(i < 10) {
				intervaloCompleto[i] = i;//ascrecenta os numeros de zero a nove
			}else {
				intervaloCompleto[i] = numCount;//acrescenta os numeros de 97 a 122 que representa o alfabeto minusculo
				numCount++;
			}
		}
		
		for (int i : intervaloCompleto) {
			System.out.print(i + " ");
		}
		System.out.println();
		//gerar numeros aleatorio no intervalo do tamanho da array intervaloCompleto
		int min = 0;
		int max = 35;
		
		
		for (int i = 1; i <= 8; i++) {
			int numAleatorio = (int) (Math.random() * (max - min + 1) + min);
			
			if(numAleatorio < 10) {
				System.out.println("Número: " + intervaloCompleto[numAleatorio]);
			}else {
				System.out.println("Letra: " + intervaloCompleto[numAleatorio]);
				
			}
			
		}
		
		
	}

}
