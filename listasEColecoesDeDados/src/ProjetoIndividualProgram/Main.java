package ProjetoIndividualProgram;

import ProjetoIndividualModelos.Shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Shopping> produtos = new ArrayList<>();

        produtos.add(new Shopping("Camiseta", 49.90));
        produtos.add(new Shopping("Tênis", 199.90));
        produtos.add(new Shopping("Calça Jeans", 89.90));
        produtos.add(new Shopping("Boné", 29.90));
        produtos.add(new Shopping("Mochila",  129.90));

//        System.out.printf("%-15s %s\n", "Produto", "Valor");
//        for (Shopping p : produtos) {
//            System.out.println(p);
//        }

        System.out.println("*******************************************");
        System.out.println("Sistema de compras online.");
        System.out.println("*******************************************");

        System.out.println("Digite o limite do cartão de crédito:");
        int limiteCartao = scanner.nextInt();

        while (true) {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Comprar produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.printf("%-15s %s\n", "Produto", "Valor");
                    for (int i = 0; i < produtos.size(); i ++) {
                        Shopping shopping = produtos.get(i);
                        System.out.printf("%d - %-15s R$ %.2f\n", i, shopping.getNomeProdutos(),
                                shopping.getValorProduto());
                    }
                    break;
                case 2:
                    
            }

        }

    }
}
