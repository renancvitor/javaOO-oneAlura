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

        System.out.printf("%-15s %s\n", "Produto", "Valor");
        for (Shopping p : produtos) {
            System.out.println(p);
        }

    }
}
