package com.deitel.java.capitulo07;

public class StudentPoll {

	//Vinte estudantes foram solicitados a classificar em uma escala de 1 a 5 a qualidade da comida no refeitório 
	//estudantil, com 1 sendo horrível e 5 sendo excelente. Coloque as 20 respostas em um array de inteiros e 
	//determine a frequencia de cada classificação
	public static void main(String[] args) {
		
		//intervalo da classificação
		
		int min = 1;
		int max = 5;
		
		//arrays das respostas
		int[] respostas = new int[20];//array de 21 posições para armazenas as classificações de 1 a 5 ignorando o zero
		
		//array de contadores de frequencia
		int[] frequencia = new int[6];
		
		//variavel que vai armazenar o valor da classificao
		var numClassificacao = 0;
		
		//loop externo para para armazenar as respostas dos 20 estudantes
		for (int i = 0; i <  respostas.length; i++) {
			numClassificacao = (int) (Math.random() * (max - min + 1) + min);
			respostas[i] = numClassificacao;
			++frequencia[respostas[i]];
			
		}
		
		System.out.printf("%s%17s%n", "Alunos", "Classificação");
		for (int i = 0; i < respostas.length; i++) {
			System.out.printf("%3d%15d%n", i, respostas[i]);
		}
		
	}

}
