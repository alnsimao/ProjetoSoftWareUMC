package main;

import java.util.Scanner;

public class LoopDoWhile {

	public static void main(String[] args) {
		// Jogo Adivinhação
		
		Scanner sc = new Scanner(System.in);
		int maquina = (int)(Math.random()*10);
		System.out.println(maquina);
		int usuario;
		
		do {
			System.out.println("Informe um número: ");
			usuario = sc.nextInt();
		} while (usuario != maquina);
		
		System.out.println("BOA PAIZÃO");
			
		
		
		
		sc.close();

	}

}
