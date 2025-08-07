package com.deitel.java.exercicios.ia.arrays;

import java.security.SecureRandom;

public class VotosSimples {

	
	//Crie um programa que simule a votação para 3 candidatos. Peça ao usuário para votar 10 vezes
	//(digitando 1, 2 ou 3) e, ao final, imprima o total de votos para cada candidato.
	
	public static void main(String[] args) {
		//gera os numeros aleatorios que representa os candidatos
		SecureRandom randonNumbers = new SecureRandom();
		
		//array que representa os números dos condidatos
		int[] totalVotos = new int[4];
		
		//o loop para realizar 10 votações
		for (int count= 1; count <= 10; count++) {
			int numRandon = randonNumbers.nextInt(3);
			System.out.println(numRandon);
			++totalVotos[1 + numRandon];
		}
		
		for (int i = 0; i < totalVotos.length; i++) {
			if (i != 0) {//condição para não imprimir o indice 0
				System.out.printf("%s%8s%n", "Candidadto", "Votos");
				System.out.printf("%3d%14d%n", i, totalVotos[i]);
				
			}
		}
		
		
		
	}

}
