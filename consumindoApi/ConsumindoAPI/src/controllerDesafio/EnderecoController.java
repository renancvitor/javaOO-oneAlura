package controllerDesafio;

import com.google.gson.Gson;
import modelsDesafio.Endereco;
import modelsDesafio.EnderecoViaCep;
import exceptions.ErroDeConversaoDeAnoException;
import serviceDesafio.ViaCepService;

import java.io.IOException;

public class EnderecoController {
    private final ViaCepService viaCepService;
    private final Gson gson;

    public EnderecoController(ViaCepService viaCepService, Gson gson) {
        this.viaCepService = viaCepService;
        this.gson = gson;
    }

    public Endereco buscarEnderecoPorCep(String cep) throws
            IOException, InterruptedException, ErroDeConversaoDeAnoException {
        String json = viaCepService.buscarEndereco(cep);
        EnderecoViaCep enderecoViaCep = gson.fromJson(json, EnderecoViaCep.class);
        return new Endereco(enderecoViaCep);
    }
}
