package desafios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		//Conversor de Moedas
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorConvertido = 0;
		
		

        System.out.println("Escolha a moeda para conversão:");
        System.out.println("1 - Dólar(R$ 1 = U$0.20)");
        System.out.println("2 - Euro(R$ 1 = $0.18)");
        System.out.println("3 - Libra(R$1 = $0.15)");
        
        int escolha = sc.nextInt();
        String moeda = "";
        System.out.println("Coloque o valor em reais: ");
		double reais = sc.nextDouble();
		
		switch(escolha) {
		case 1:
			valorConvertido = reais * 0.20;
			moeda = "dólares";
			break;
		case 2:
			valorConvertido = reais * 0.18;
			moeda = "euros";
			break;
		case 3:
			valorConvertido = reais * 0.15;
			moeda = "libras";
		break;
		default:
			System.out.println("Escolha inválida");
			break;
		}
		
		System.out.println("Valor convertido: "+valorConvertido+ " "+moeda);
		
		
		
		
		
		
		
		sc.close();

	}

}
