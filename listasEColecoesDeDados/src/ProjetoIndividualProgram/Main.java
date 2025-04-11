package ProjetoIndividualProgram;

import ProjetoIndividualModelos.CartaoCredito;
import ProjetoIndividualModelos.Compra;
import ProjetoIndividualModelos.Produtos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Compra compra = new Compra();
        Produtos produtos = new Produtos();

        System.out.println("*******************************************");
        System.out.println("Sistema de compras online.");
        System.out.println("*******************************************");

        System.out.print("Digite o limite do cartão de crédito: ");
        CartaoCredito cartaoCredito = new CartaoCredito();
        double limite = scanner.nextDouble();
        cartaoCredito.setLimiteCartao(limite);

        List<Produtos> produtosComprados = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Listar produtos");
            System.out.println("2 - Comprar produtos");
            System.out.println("3 - Lista produtos comprados (ordenados por valor)");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    List<Produtos> listaProdutos = compra.getProdutosDisponiveis();
                    System.out.printf("\n%-5s %-15s %s\n", "ID", "Produto", "Valor");
                    for (Produtos p : listaProdutos) {
                        System.out.printf("%-5d %-15s R$ %.2f\n", p.getId(), p.getNomeProdutos(), p.getValorProduto());
                    }
                    break;

                case 2:
                    System.out.print("Digite o ID do produto que deseja comprar: ");
                    int idProduto = scanner.nextInt();
                    Produtos produtoSelecionado = null;

                    for (Produtos p : compra.getProdutosDisponiveis()) {
                        if (p.getId() == idProduto) {
                            produtoSelecionado = p;
                            break;
                        }
                    }

                    if (produtoSelecionado != null) {
                        cartaoCredito.comprar(produtoSelecionado.getValorProduto());
                        produtosComprados.add(produtoSelecionado);
                    } else {
                        System.out.println("❌ Produto não encontrado!");
                    }
                    break;

                case 3:
                    if (produtosComprados.isEmpty()) {
                        System.out.println("❌ Nenhum produto foi comprado ainda.");
                    } else {
                        produtosComprados.sort(Comparator.comparing(Produtos::getValorProduto));
                        System.out.println("\nProdutos comprados (ordenados por valor):");
                        for (Produtos p : produtosComprados) {
                            System.out.printf("- ID: %-3d %-15s R$ %.2f\n", p.getId(), p.getNomeProdutos(), p.getValorProduto());
                        }
                    }
                    break;

                case 4:
                    System.out.println("🛒 Obrigado por usar nosso sistema de compras!");
                    return;

                default:
                    System.out.println("⚠️ Opção inválida.");
            }
        }
    }
}
