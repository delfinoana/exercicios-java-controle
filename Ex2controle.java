package controle;

import java.util.Scanner;

public class Ex2controle {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira ano: ");
		int ano = entrada.nextInt();

		entrada.close();
		
		
		if (ano % 4 == 0) {
			System.out.println("O ano inserido ? um ano bissexto");
		} else if (ano % 4 != 0) 
			System.out.println("O ano inserido n?o ? um ano bissexto");
		
		
	}

}
