package ProjetoIndividualModelos;

public class Produtos {
    private int id;
    private String nomeProdutos;
    private double valorProduto;

    public Produtos() {
    }

    public Produtos(int id, String nomeProdutos, double valorProduto) {
        this.id = id;
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
