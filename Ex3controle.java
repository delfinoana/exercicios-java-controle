package controle;

import java.util.Scanner;

public class Ex3controle {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira a primeira nota");
		double nota1 = entrada.nextDouble();
		
		System.out.println("Insira a segunda nota");
		double nota2 = entrada.nextDouble();
		
		entrada.close();
		
		double media = (nota1 + nota2)/2;
		
		if (media >= 7.0) {
			System.out.println("Sua m?dia ?: " + media);
			System.out.println("Voc? est? aprovado");
		} else if (media < 7.0 && media>= 4.0) {
			System.out.println("Sua m?dia ?: " + media);
			System.out.println("Voc? est? em recupera??o");
		} else if (media < 4.0) {
			System.out.println("Sua m?dia ?: " + media);
			System.out.println("Voc? est? reprovado");
		}
	}

}
