package controle;

import java.util.Scanner;

public class Ex9controle {
	
	//Crie um programa que recebe 10 valores e ao final imprima o maior n?mero
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um n?mero : ");
		Double x = entrada.nextDouble();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Insira um n?mero : ");
			Double x1 = entrada.nextDouble();
			
				if (x1 > x) {
					x = x1;
				}
	
		}
		
		System.out.println("O maior n?mero inserido foi: " + x );
		
		entrada.close();
		
	}

}
