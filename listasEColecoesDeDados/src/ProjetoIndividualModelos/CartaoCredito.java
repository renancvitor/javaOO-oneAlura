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

    public void comprar(double valor) {
        if (valor > 0 && valor < limiteCartao) {
            limiteCartao -= valor;
            System.out.println("Compra realizada com sucesso! Limite atual = R$ " +
                    String.format("%.2f", limiteCartao));
        } else {
            System.out.println("Limite insuficiente para esta compra. Favor verificar!");
        }
    }

    @Override
    public String toString() {
        return "R$ " + String.format("%.2f", limiteCartao);
    }
}
