package poo;

public class ContaMes {
	public double agua;
	public double alimentacao;
	public double luz;
	
	public double somaMes() {
		return agua + luz + alimentacao;	
	}
	public void exibirConta() {
		System.out.println("Conta de água: "+agua);
		System.out.println("Conta de luz: "+luz);
		System.out.println("Compras do mês: "+alimentacao);
		System.out.println("Soma total: "+somaMes());
	}
}
