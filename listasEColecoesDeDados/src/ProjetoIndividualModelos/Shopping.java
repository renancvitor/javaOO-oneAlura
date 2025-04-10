package ProjetoIndividualModelos;

public class Shopping {
    private String nomeProdutos;
    private double valorProduto;

    public Shopping(String nomeProdutos, double valorProduto) {
        this.nomeProdutos = nomeProdutos;
        this.valorProduto = valorProduto;
    }

    public String getNomeProdutos() {
        return nomeProdutos;
    }

    public double getValorProduto() {
        return valorProduto;
    }
}
