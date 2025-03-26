package exemplo;

public class Principal {

	public static void main(String[] args) {
		//
		Carro civic = new Carro();
		civic.fabricante = "Honda";
		civic.modelo = "Civic";
		civic.ano = 2024;
		civic.placa = "EIC-2490";
		civic.cor = "Preta";
		civic.velocidade = 0;
		civic.acelera(10);
		civic.acelera(20);
		civic.freia(10);
		civic.exibirInfo();
		
		Carro corolla = new Carro();
		corolla.fabricante = "Toyota";
		corolla.modelo = "Corolla";
		corolla.motor = 2.0;
		corolla.placa = "EUC-2015";
		corolla.cor = "Prata";
		corolla.ano = 2023;
		corolla.velocidade = 0;
		
		corolla.exibirInfo();
		
		Carro jetta = new Carro();
		jetta.fabricante = "Volksvagen";
		jetta.modelo = "Jetta";
		jetta.ano = 2025;
		jetta.placa = "EPC-2025";
		jetta.cor = "Branco";
		jetta.velocidade = 0;
		jetta.motor = 2.0;
		jetta.exibirInfo();
		
		
	}

}
