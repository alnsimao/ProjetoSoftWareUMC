package repeticoes;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String loginSalvo = "admin";
		String senhaSalva = "admin";
		
		String login = "";
		String senha = "";
		
		while (true) {
			System.out.println("Digite seu login: ");
			login = sc.nextLine();
			System.out.println("Digite sua senha: ");
			senha = sc.nextLine();
			
			if(login .equals(loginSalvo) && senha.equals(senhaSalva)) {
				System.out.println("Acesso liberado");
				break;
			} else {
				System.out.println("Acesso negado, tente novamente!");
			}
		}
		sc.close();

	}

}
