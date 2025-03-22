package desafios;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        // Número Par ou Ímpar
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        double somaPares = 0;
        double somaImpares = 0;
        int countPar = 0;
        int countImp = 0;

        System.out.println("Coloque um número: ");
        numero = sc.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                somaPares += numero; 
                countPar++;
            } else {
                somaImpares += numero; 
                countImp++;
            }

            System.out.println("Coloque um número (0 para sair): ");
            numero = sc.nextInt();
        }

        System.out.println("Soma dos Pares: " + somaPares);
        System.out.println("Soma dos Ímpares: " + somaImpares);
        System.out.println("Quantidade Pares: "+countPar);
        System.out.println("Quantidade Ímpares: "+countImp);
        

        sc.close();
    }
}