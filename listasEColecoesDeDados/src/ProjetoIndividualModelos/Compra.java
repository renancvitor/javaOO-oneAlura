package ProjetoIndividualModelos;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private List<Produtos> produtos;

    public Compra(){
        produtos = new ArrayList<>();
        produtos.add(new Produtos(1, "Camiseta", 49.90));
        produtos.add(new Produtos(2, "Tênis", 199.90));
        produtos.add(new Produtos(3, "Calça Jeans", 89.90));
        produtos.add(new Produtos(4, "Boné", 29.90));
        produtos.add(new Produtos(5, "Mochila",  129.90));
    }

    public List<Produtos> getProdutosDisponiveis() {
        return produtos;
    }
}
