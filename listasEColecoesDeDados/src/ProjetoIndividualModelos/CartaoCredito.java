package ProjetoIndividualModelos;

public class CartaoCredito {
    private double limiteCartao;

    public CartaoCredito(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }

    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%.2f", limiteCartao);
    }
}
