package controle;

import java.util.Scanner;

public class Ex4controle {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("insira o n?mero:");
		
		int num = entrada.nextInt();
		
		entrada.close();
		
		int contadorDeDivisores = 0;
		
		for (int i = 2; i < num; i++) {
				
			if (num % i == 0) {
				contadorDeDivisores++;
			}
		}
			
		if (contadorDeDivisores == 0) {
			System.out.println("O n?mero ? primo");
		} else {
			System.out.println("O n?mero n?o ? primo");
		}
			
	}

}
