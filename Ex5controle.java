package controle;

import java.util.Scanner;

public class Ex5controle {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("insira o número:");
		
		int num = entrada.nextInt();
		
		int contadorDeDivisores = 0;
		
		int mod = 0;
		
		for (int i = 2; i < num; i++) {
			
			mod = num % i;
			
			switch (mod) {
			case 0:
				contadorDeDivisores++;
				break;
			}
		}
			
			switch (contadorDeDivisores) {
			case 0:
					System.out.println("O número é primo");
					break;
			default:
					System.out.println("O número não é primo");
		}
			
		entrada.close();
		
	}


}
