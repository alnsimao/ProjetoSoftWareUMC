package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Roupa[] roupas = new Roupa[100]; 
        int contadorRoupas = 0;

        while (true) {
            System.out.println("\n1. Registrar nova roupa");
            System.out.println("2. Adicionar estoque");
            System.out.println("3. Remover estoque");
            System.out.println("4. Exibir todas as roupas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Tipo: ");
                    String tipo = sc.nextLine();

                    System.out.print("Tamanho (P, M, G): ");
                    String tamanho = sc.nextLine();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();

                    System.out.print("Valor unitário: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    if (contadorRoupas < roupas.length) {
                        roupas[contadorRoupas] = new Roupa(marca, tipo, tamanho, quantidade, valor);
                        contadorRoupas++;
                    } else {
                        System.out.println("Limite de roupas atingido.");
                    }
                    break;

                case 2:
                    if (contadorRoupas == 0) {
                        System.out.println("Nenhuma roupa registrada.");
                        break;
                    }
                    System.out.print("Índice da roupa para adicionar estoque: ");
                    int indexAdd = sc.nextInt();
                    System.out.print("Quantidade a adicionar: ");
                    int qtdAdd = sc.nextInt();
                    sc.nextLine(); 

                    if (indexAdd >= 0 && indexAdd < contadorRoupas && roupas[indexAdd] != null) {
                        roupas[indexAdd].adicionarEstoque(qtdAdd);
                        System.out.println("Estoque atualizado:");
                        System.out.println(roupas[indexAdd].getInformacoes());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    if (contadorRoupas == 0) {
                        System.out.println("Nenhuma roupa registrada.");
                        break;
                    }
                    System.out.print("Índice da roupa para remover estoque: ");
                    int indexRem = sc.nextInt();
                    System.out.print("Quantidade a remover: ");
                    int qtdRem = sc.nextInt();
                    sc.nextLine(); 

                    if (indexRem >= 0 && indexRem < contadorRoupas && roupas[indexRem] != null) {
                        roupas[indexRem].removerEstoque(qtdRem);
                        System.out.println("Estoque atualizado:");
                        System.out.println(roupas[indexRem].getInformacoes());
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    if (contadorRoupas == 0) {
                        System.out.println("Nenhuma roupa registrada.");
                    } else {
                        for (int i = 0; i < contadorRoupas; i++) {
                            if (roupas[i] != null) {
                                System.out.println("[" + i + "] " + roupas[i].getInformacoes());
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Encerrado");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}