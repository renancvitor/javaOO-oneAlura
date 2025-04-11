package ProjetoIndividualProgram;

import ProjetoIndividualModelos.CartaoCredito;
import ProjetoIndividualModelos.Produtos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Produtos> produtos = new ArrayList<>();

        produtos.add(new Produtos("Camiseta", 49.90));
        produtos.add(new Produtos("Tênis", 199.90));
        produtos.add(new Produtos("Calça Jeans", 89.90));
        produtos.add(new Produtos("Boné", 29.90));
        produtos.add(new Produtos("Mochila",  129.90));

//        System.out.printf("%-15s %s\n", "Produto", "Valor");
//        for (Shopping p : produtos) {
//            System.out.println(p);
//        }

        System.out.println("*******************************************");
        System.out.println("Sistema de compras online.");
        System.out.println("*******************************************");

        System.out.println("Digite o limite do cartão de crédito:");
        CartaoCredito cartaoCredito = new CartaoCredito();
        double limite = scanner.nextDouble();
        cartaoCredito.setLimiteCartao(limite);

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
                        Produtos shopping = produtos.get(i);
                        System.out.printf("%d - %-15s R$ %.2f\n", i, shopping.getNomeProdutos(),
                                shopping.getValorProduto());
                    }
                    break;
                case 2:

            }

        }

    }
}
