package controle;

import java.util.Scanner;

public class Ex7controle { 
	
	public static void main(String[] args) {
		
	
	
	String num = "";
	
	Scanner entrada = new Scanner (System.in);
	
	Double numb = 0.0;
	Double soma = 0.0;
	

	while (!num.startsWith("-")) {
			 
			System.out.println("Insira um número: ");
			num = entrada.nextLine();
			
			numb = Double.parseDouble(num);
			
			
			if (!num.startsWith("-")) {
				soma = numb + soma;
				System.out.println(soma);}
			
		}  
			
	System.out.println("O total foi " + soma);
	
	entrada.close();
	}
}
