package com.deitel.java.exercicios.ia.arrays;

import java.util.Scanner;

public class AnaliseLetras {
	
	/*Peça ao usuário para digitar uma frase. Use um array de tamanho 26 para contar a
    frequência de cada letra do alfabeto (ignorando maiúsculas e minúsculas). Imprima o resultado.*/

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		
		//formata as letras da frase em minuscula e retira os espaços
		String frase = sc.nextLine().toLowerCase().trim();
		//tamanho da frase inseridda
		System.out.println("Número de caracteres da frase sem espaços:\n" + frase.length());
		
		//array para armazenas os caracteres da frase
		//o tamanho da array vai ser definido pelo numero de caracteres da frase
		char[] fraseCaracteres = new char[frase.length()];
		
		//iterando sobre as letras da frase
		for (int i = 0; i < frase.length(); i++) {
			//em cada posicao da array de caracteres, vai ser adicionado a letra da frase correspondente a mesma posicao
			fraseCaracteres[i] = frase.charAt(i);
		}
		System.out.println("Imprimindo o último caractére: " + fraseCaracteres[4]);
		System.out.println("Tamanho da array de caracteres: " + fraseCaracteres.length);
		System.out.println(fraseCaracteres.getClass().isArray());
		
		for (char c : fraseCaracteres) {
			System.out.print(c + " ");
		}

		String[] frequenciaLetras = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
				"m", "n", "o", "p", "k", "r", "s", "t", "u", "v", "x", "y", "w", "z"};
//		System.out.println(frequenciaLetras.length);
		
		
	
	}

}
