package com.deitel.java.exercicios.ia.arrays;

import java.util.Iterator;
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
		
		//imprime os caracteres da array
		for (char c : fraseCaracteres) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		
		int[] frequencia = new int[26];
		char[] alfabeto = new char[26];
		
		for (int i = 0; i < 26; i++) {
			alfabeto[i] = (char) ('a' + i);
		}
		
		for (int i = 0; i < fraseCaracteres.length; i++) {
			for (int j = 0; j < alfabeto.length; j++) {
				
				if(fraseCaracteres[i] == alfabeto[j]) {
					++frequencia[j];
				}
			}
		}
		
		for (int i = 0; i < frequencia.length; i++) {
			System.out.printf("%s%14s%n", "Letra", "Frequencia");
			System.out.printf("%3s%8d%n", alfabeto[i], frequencia[i]);
		}
		
		
		
//		System.out.println("Imprimindo o último caractére: " + fraseCaracteres[4]);
//		System.out.println("Tamanho da array de caracteres: " + fraseCaracteres.length);
		
		//verifica se é do tipo array
//		System.out.println(fraseCaracteres.getClass().isArray());
		

		
		
		
		for (char c : alfabeto) {
			System.out.print(c + " ");
		}
	
	}

}
