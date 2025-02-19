package atividadesEntrega;

import java.util.Locale;
import java.util.Scanner;

public class calculoJurosComposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque o capital inicial: ");
		double c = sc.nextDouble();
		
		System.out.println("Coloque a Taxa de Juros: ");
		double i = sc.nextDouble();
		
		System.out.println("Coloque os Meses: ");
		int t = sc.nextInt();
		
		double m = c * Math.pow(1+i,t);
		
		System.out.printf("O montante total é: %.2f\n",m);
		
		
		
		
		
		
		sc.close();

	}

}
