package ProjetoIndividualModelos;

public class Produtos implements Comparable<Produtos> {
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
    public int compareTo(Produtos o) {
        return Double.compare(this.valorProduto, o.valorProduto);
    }
}
