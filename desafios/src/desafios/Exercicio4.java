package desafios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		// Média de Números DO-WHILE
		Scanner sc = new Scanner(System.in);
		double numero;
		double soma = 0;
		int cont = 0;
		do {
		System.out.println("Coloque um número: ");
		numero = sc.nextInt();
		soma += numero;
		cont++;
		} while (numero !=0);
		cont--;
		
		double media = soma / cont;
		
		System.out.println(media);
		
		
		sc.close();

	}

}
