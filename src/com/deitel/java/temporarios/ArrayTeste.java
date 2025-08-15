package com.deitel.java.temporarios;

public class ArrayTeste {

	public static void main(String[] args) {

//		StringBuilder sb = new StringBuilder();
//		sb.append("a");
//		sb.append(2);
//		sb.append('z');
//		
//		StringBuilder sb2 = new StringBuilder();
//		sb2.append("c");
//		sb2.append(5);
//		sb2.append('b');
//		
//		StringBuilder sb3 = new StringBuilder();
//		sb3.append("v");
//		sb3.append("x");
//		sb3.append(8);
//		
//		String stg = sb.toString();
//		System.out.println(stg);
//		
//		String[] arrayString = new String[3];
//		arrayString[0] = sb.toString();
//		arrayString[1] = sb2.toString();
//		arrayString[2] = sb3.toString();
//		
//		for (String string : arrayString) {
//			System.out.println(string);
//		}
		
		//String.valueOf();
		int[] num = new int[8];
		preencheArrayNumerica(num);
		
		for (int i : num) {
			System.out.print(i);
		}
		
		System.out.println("\n_____________________");
		String[] stg = converteString(num);
		
		for (String string : stg) {
			System.out.println(string);
		}
		
		
	}
	
	public static String[] converteString(int[] array) {
		String[] armazenaSenha = new String[5];
		
		for (int i = 0; i < armazenaSenha.length; i++) {
			for (int j = 0; j < array.length; j++) {
				StringBuilder sb  = new StringBuilder();
				sb.append(String.valueOf(array[i]));
				armazenaSenha[i] = sb.toString();
			}
		}
		return armazenaSenha;
	}
	
	public static void preencheArrayNumerica(int[] array) {
		int min = 0;
		int max = 9;
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * (max - min + 1) + min);
		}
	}
}
