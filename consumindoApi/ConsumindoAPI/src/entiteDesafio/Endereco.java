package entiteDesafio;

public class Endereco {
    String cep;
    String logradouro;
    String localidade;
    String uf;

    @Override
    public String toString() {
        return "{Cep = " + cep +
                ", Logradouro = " + logradouro +
                ", Localidade = " + localidade +
                ", UF = " + uf +
                "}";
    }
}
