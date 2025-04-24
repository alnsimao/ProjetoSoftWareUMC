package src;

public class Roupa {
    private String marca;
    private String tipo;
    private String tamanho;
    private int quantidade;
    private double valor;

    public Roupa(String marca, String tipo, String tamanho, int quantidade, double valor) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public double calcularValorTotal() {
        return quantidade * valor;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public String getInformacoes() {
        return String.format(
            "Marca: %s | Tipo: %s | Tamanho: %s | Quantidade: %d | Valor unitário: R$%.2f | Valor total: R$%.2f",
            marca, tipo, tamanho, quantidade, valor, calcularValorTotal()
        );
    }
}
