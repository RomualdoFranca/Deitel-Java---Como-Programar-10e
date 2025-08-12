package com.deitel.java.exercicios.ia.arrays;

import java.util.Iterator;
import java.util.Scanner;

public class AnaliseLetras {
	
	/*Peça ao usuário para digitar uma frase. Use um array de tamanho 26 para contar a
    frequência de cada letra do alfabeto (ignorando maiúsculas e minúsculas). Imprima o resultado.*/

	public static void main(String[] args) {

		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Digite uma frase:");
		
		//formata as letras da frase em minuscula e retira os espaços. Exemplo de pre processamento
		String frase = sc.nextLine().toLowerCase().trim();//o .trim() retira os espaços do inicio e final da string
		//tamanho da frase inseridda
		System.out.println("Número de caracteres da frase sem espaços:\n" + frase.length());
		
		//*********** IA comments *****************************
		//O código cria um array de caracteres (char[] fraseCaracteres) e o preenche com os caracteres da string.
		//Embora funcional, essa etapa de criar um novo array para a frase não é estritamente necessária.
		//O loop de contagem poderia iterar diretamente sobre a string frase usando o método frase.charAt(i).
		//**************************************************************************************
		
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
		//imprime uma quebra de linha
		System.out.println();
		
		
		int[] frequencia = new int[26];//array para armazenar o numero de frequencia em que as letras aparecem na frase
		char[] alfabeto = new char[26];//armazena o alfabeto
		
		//gera e preenche a array com as letras do alfabeto
		for (int i = 0; i < 26; i++) {
			alfabeto[i] = (char) ('a' + i);
		}
		
		//o loop externo itera sobre a array de caracteres
		for (int i = 0; i < fraseCaracteres.length; i++) {
			//o loop interno itera sobre a array com as letras do alfabeto
			for (int j = 0; j < alfabeto.length; j++) {
				//compara letra da array de caractere com os letras da array de letras do alfabeto
				if(fraseCaracteres[i] == alfabeto[j]) {
					//adiciona 1 cada vez que uma determinada letra é encontrada numa posição correspondente
					//da array do alfabeto
					++frequencia[j];
				}
			}
		}
		
		for (int i = 0; i < frequencia.length; i++) {
			//imprime de forma tabular a letra e numero de frequencia que aparece na frase
			System.out.printf("%s%14s%n", "Letra", "Frequência");
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
