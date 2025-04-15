package serviceDesafio;

import exceptionsDesafio.ErroDeConversaoDeCepException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    private static final String URL_BASE = "https://viacep.com.br/ws/";

    public String buscarEndereco(String cep) throws IOException, InterruptedException {
        if (cep == null || cep.length() != 8 || !cep.matches("\\d+")) {
            throw new ErroDeConversaoDeCepException("CEP inválido. O CEP deve ter exatamente 8 dígitos numéricos.");
        }
        String url = URL_BASE + cep + "/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }
}
