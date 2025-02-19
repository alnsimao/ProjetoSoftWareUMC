package atividadesEntrega;

import java.util.Locale;
import java.util.Scanner;

public class conversaoTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Coloque a temperatura em Celsius: ");
		double celsius = sc.nextDouble();
		
		double kelvin =  celsius  + 273.15;
		double fahrenheit = (celsius * 9/5) + 32;
		System.out.println("A sua temperatura em Kelvin vai ser: "+ kelvin + " E em Fahrenheit: "+fahrenheit);
		sc.close();
		
		
		

	}

}
