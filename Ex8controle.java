package controle;

import java.util.Scanner;

public class Ex8controle {
	
	public static void main(String[] args) {
		
	
		Scanner entrada = new Scanner(System.in);
		
		String a = entrada.nextLine();
		
		int d = 0;
		
		for (int i = 1; i <= a.length(); i++) {
				
				char x = a.charAt(d);
				
				d++;
				
				System.out.println(x);
		}
				
		entrada.close();

		
	}

}
