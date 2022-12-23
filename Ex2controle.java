package controle;

import java.util.Scanner;

public class Ex2controle {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira ano: ");
		int ano = entrada.nextInt();

		entrada.close();
		
		
		if (ano % 4 == 0) {
			System.out.println("O ano inserido é um ano bissexto");
		} else if (ano % 4 != 0) 
			System.out.println("O ano inserido não é um ano bissexto");
		
		
	}

}
