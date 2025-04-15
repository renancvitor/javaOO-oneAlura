package entiteDesafio;

public class Endereco {
    String cep;
    String logradouro;
    String localidade;
    String uf;

    public Endereco(EnderecoViaCep enderecoViaCep) {
        this.cep = enderecoViaCep.cep();
        this.logradouro = enderecoViaCep.logradouro();
        this.localidade = enderecoViaCep.localidade();
        this.uf = enderecoViaCep.uf();
    }

    @Override
    public String toString() {
        return "{Cep = " + cep +
                ", Logradouro = " + logradouro +
                ", Localidade = " + localidade +
                ", UF = " + uf +
                "}";
    }
}
