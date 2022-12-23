package controle;

import java.util.Scanner;

public class Ex9controle {
	
	//Crie um programa que recebe 10 valores e ao final imprima o maior número
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número : ");
		Double x = entrada.nextDouble();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Insira um número : ");
			Double x1 = entrada.nextDouble();
			
				if (x1 > x) {
					x = x1;
				}
	
		}
		
		System.out.println("O maior número inserido foi: " + x );
		
		entrada.close();
		
	}

}
