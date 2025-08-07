package com.deitel.java.exercicios.ia.arrays;

import java.util.Scanner;

public class AnaliseLetras {
	
	/*Peça ao usuário para digitar uma frase. Use um array de tamanho 26 para contar a
    frequência de cada letra do alfabeto (ignorando maiúsculas e minúsculas). Imprima o resultado.*/

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		//converte as letras da frase em minuscula e retira os espaços
		String frase = sc.nextLine().toLowerCase().trim();

		String[] frequenciaLetras = new String[] {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
				"m", "n", "o", "p", "k", "r", "s", "t", "u", "v", "x", "y", "w", "z"};
		System.out.println(frequenciaLetras.length);
		
		
	
	}

}
