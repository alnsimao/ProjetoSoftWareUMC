package atividadesEntrega;

import java.util.Locale;
import java.util.Scanner;

public class AreaPerimetroCirculo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Coloque o Raio do seu circulo: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		double perimetro = 2 *  Math.PI * raio;
		
		System.out.printf("A area do seu circulo é: %.2f %n" , area);
		System.out.printf("E o perimetro é: %.2f ",perimetro);
		
		sc.close();

	}

}
