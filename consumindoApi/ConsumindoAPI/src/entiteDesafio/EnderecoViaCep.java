package entiteDesafio;

public record EnderecoViaCep(
        String cep,
        String logradouro,
        String localidade,
        String uf
) {}