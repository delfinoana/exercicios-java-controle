package controle;

import java.util.Scanner;

public class Ex5controle {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("insira o n?mero:");
		
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
					System.out.println("O n?mero ? primo");
					break;
			default:
					System.out.println("O n?mero n?o ? primo");
		}
			
		entrada.close();
		
	}


}
