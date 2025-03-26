package poo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaMes jan = new ContaMes();
		System.out.println("Coloque os valores das contas do mês de janeiro");
		System.out.println("Valor da conta de água: ");
		jan.agua = sc.nextDouble();
		System.out.println("Valor das compras do mercado: ");
		jan.alimentacao = sc.nextDouble();
		System.out.println("Valor da conta de luz: \n");
		jan.luz = sc.nextDouble();
		
		
		
		ContaMes fev = new ContaMes();
		System.out.println("Coloque os valores das contas do mês de fevereiro: ");
		System.out.println("Valor da conta de água: ");
		fev.agua = sc.nextDouble();
		System.out.println("Valor das compras do mercado: ");
		fev.alimentacao = sc.nextDouble();
		System.out.println("Valor da conta de luz: \n");
		fev.luz = sc.nextDouble();
		System.out.println("Valores das contas de janeiro\n");
		jan.exibirConta();
		System.out.println("\nValores das contas de fevereiro\n");
		fev.exibirConta();
		
		if (fev.somaMes() > jan.somaMes()) {
			System.out.println("\nA conta de fevereiro foi maior que a de janeiro");
		} else {
			System.out.println("\nA conta de janeiro foi maior que a de fevereiro");
		}
		
		
		
		
		
		
		
		sc.close();
		
		
		
	}

}
