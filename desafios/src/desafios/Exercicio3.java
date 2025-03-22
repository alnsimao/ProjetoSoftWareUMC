package desafios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//PROGRAMA DE EMPRESTIMO
		Scanner sc = new Scanner(System.in);
		
	
		
		System.out.println("Insira o valor que você quer receber do empréstimo: ");
		double valor = sc.nextDouble();
		double valorTotal = 0;
		System.out.println("Insira a quantidade de parcelas: ");
	
		System.out.println("1- Empréstimo 6 meses: 5% do valor total");
		System.out.println("2- Empréstimo 12 meses: 10% do valor total");
		System.out.println("3- Empréstimo 20 meses: 20% do valor total");
		int escolha = sc.nextInt();
	
		
		switch (escolha) {
		case 1: 
			valorTotal = valor + (valor * 0.05);
			System.out.println("O valor total a ser pago vai ser: " +valorTotal);
			break;
		case 2: 
			 valorTotal = valor + (valor * 0.10);
			System.out.println("O valor total a ser pago vai ser: " +valorTotal);
			break;
		case 3: 
			valorTotal = valor + (valor * 0.20);
			System.out.println("O valor total a ser pago vai ser: " +valorTotal);
			break;
		default:
			System.out.println("Não tem essa opção!");
			break;
		}
		
		
		
		sc.close();

	}

}
