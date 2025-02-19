package variaveisAula;

import java.util.Scanner;

public class entradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite o seu Nome: ");
		nome = sc.next();
		System.out.println("Você Digitou" +nome);
		sc.close();

	}

}
