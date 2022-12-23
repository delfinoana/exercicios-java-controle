package controle;

import java.util.Scanner;

public class Ex1controle {
	
	public static void main(String[] args) {
		
		//1. Criar um programa que receba um número e 
		//verifique se ele está entre 0 e 10 e é par;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		double num = entrada.nextDouble();

		entrada.close();
		
		if (num % 2 == 0 && 0 < num && 10 > num ) {
			System.out.println("O número inserido é par e está entre 0 e 10");
		} else if (num % 2 == 0) {
			System.out.println("O número é par, mas não está entre 0 e 10");
		} else if (0 < num && 10 > num) {
			System.out.println("O número está entre 0 e 10, mas não é par");
		} else if (num % 2 != 0) {
			System.out.println("Número ímpar, maior que 10");
		}
	

}
}
