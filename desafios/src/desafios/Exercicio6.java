package desafios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// Fatorial
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Coloque um número: ");
		int numero = sc.nextInt();
		double fatorial = 1;
		
		for (int i = 1; i <=numero; i++) {
		 fatorial *= i;
		}
		 System.out.println("O fatorial de " + numero + " é: " + fatorial);
				
		
		
		
		sc.close();

	}

}
