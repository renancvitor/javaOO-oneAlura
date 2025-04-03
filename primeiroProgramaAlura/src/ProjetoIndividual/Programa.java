package ProjetoIndividual;

import java.util.Scanner;

public class Programa {
    private static Pessoa pessoa;
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        pessoa = new Pessoa("Renan", "C. Vitor", "Corrente", 2500);

        System.out.println("*******************************************");
        System.out.println("Dados inicias do cliente:");
        System.out.println();

        pessoa.exibitDadosCliente();
        System.out.println("*******************************************");

        while (true) {
            System.out.println("\nOperações:\n");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");

            System.out.println("Digite a operação desejada:");
            int operacao = scanner.nextInt();

            switch (operacao){
                case 1:
                    pessoa.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Digite o valor a receber:");
                    double valorRecebido = scanner.nextDouble();
                    pessoa.receberValor(valorRecebido);
                    break;
                case 3:
                    System.out.println("Digite o valor a transferir:");
                    double valorTransferido = scanner.nextDouble();
                    pessoa.transferirValor(valorTransferido);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
                    operacao = scanner.nextInt();
            }
        }
    }
}
