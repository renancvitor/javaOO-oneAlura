package ProjetoIndividualModelos;

public class Produtos {
    private int id;
    private String nomeProdutos;
    private double valorProduto;

    public Produtos(int id) {
        this.id = id;
    }

    public Produtos(String nomeProdutos, double valorProduto) {
        this.nomeProdutos = nomeProdutos;
        this.valorProduto = valorProduto;
    }

    public int getId() {
        return id;
    }

    public String getNomeProdutos() {
        return nomeProdutos;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    @Override
    public String toString() {
        return String.format("%-15s R$ %.2f", nomeProdutos, valorProduto);
    }
}
