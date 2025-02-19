package atividadesEntrega;

import java.util.Locale;
import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Coloque a Primeira Nota: " );
		double nota1 = sc.nextDouble();
		
		System.out.println("Coloque a Segunda Nota: " );
		double nota2 = sc.nextDouble();
		
		System.out.println("Coloque a Terceira Nota: " );
		double nota3 = sc.nextDouble();
		
		double media = (nota1 + nota2 + nota3) /3;
		
		System.out.printf("A Média final do aluno é: %.2f\n " ,media);
				
		
	
		sc.close();

	}

}
