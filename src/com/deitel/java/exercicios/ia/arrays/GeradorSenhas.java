package com.deitel.java.exercicios.ia.arrays;

public class GeradorSenhas {

	//Simule a geração de 50 senhas de 8 caracteres. As senhas devem ser compostas por letras e números.
    //Use um array para contar quantas vezes cada um dos 10 dígitos (0-9) aparece nas senhas geradas.
	
	public static void main(String[] args) {

//		int min = 97;
//		int max =  122;
		
		// Explicação da fórmula:
		// (max - min + 1) -> Define o tamanho do intervalo. Por exemplo, de 97 a 122, são 25 números.
		// Math.random() * (max - min + 1) -> Gera um double entre 97.0 e 121.99999...
		// (int) -> Converte o double para um inteiro, truncando as casas decimais.
		// + min -> Desloca o resultado para começar a partir do 'min'.
		
		double min = 0.97;
		double max = 0.99;
//		//tamaho total do intervalo: 
//		System.out.println("tamaho total do intervalo:" + (max - min));
		
		
		//loop para gerar uma sequencia numerica representando os numero correspondentes as letras minusculas da tabela ASCII
		for (int i = 97; i <= 122; i++) {
			System.out.printf(i +" ");
		}
		System.out.println();
		
		
		//loop com condicionais que imprime apenas os números no intervalo dos numeros da tabela ASCII de letras minusculas
		
		for (int i = 1; i < 20; i++) {
			double random = Math.random();
			if (random >= 0.97) {
				random *= 100;
				int num = (int) random;
				System.out.println(num);
				
			}else if(random >= 0.1 && random <= 0.122) {
				random *= 1000;
				int num = (int) random;
				System.out.println(num);
				
			}else {
				System.out.println("Número diferente do intervalo");
				
			}
			
		}
		
		
		
	}

}
