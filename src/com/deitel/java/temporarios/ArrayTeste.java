package com.deitel.java.temporarios;

public class ArrayTeste {

	public static void main(String[] args) {

		//arry que armazena os numeros do intervalo de zero a nove
		int[] primeiroIntervalo = new int[10];
		
		//preenche a array com os numero de 0  a 9
		for (int i = 0; i < primeiroIntervalo.length; i++) {
			primeiroIntervalo[i] = i;
		}
		for (int i : primeiroIntervalo) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		int[] segundoIntervalo = new int[26];
		int count = 97;
		
		for (int i = 0; i < segundoIntervalo.length; i++) {
			segundoIntervalo[i] = count;
			count++;
		}
		
		for (int i : segundoIntervalo) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		
		
		
		
	}

}
