package desafios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Jogo de Adivinhação
		
		int maquina = (int)(Math.random()*10);
		int jogador;
		int tentativa = 0;
		String resp;
		
		System.out.println("Tente adivinha um número aleatório de 1 a 10!!!");
	
		do {
			System.out.println("Coloque um número: ");
			jogador = sc.nextInt();
			if(jogador == maquina) {
				System.out.println("Você acertou!!\n");
				++tentativa;
				resp = "acertou";
			} else {
				System.out.println("Você errou!!!\n");
				++tentativa;
				resp = "errou";
			}
		} while(tentativa < 1);
		
		System.out.println("Número de tentativas: " + tentativa);
        System.out.println("Número da máquina: " + maquina);
        System.out.println("Seu número: " + jogador);
        System.out.println("Resultado: Você " + resp + "!");
		
		
		
		sc.close();
	}

}
