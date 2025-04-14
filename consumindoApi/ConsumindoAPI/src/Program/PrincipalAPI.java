package Program;

import com.google.gson.Gson;
import modelos.Titulo;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalAPI {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um filme para buscar: ");
        String buscaFilme = sc.nextLine().toLowerCase(); // Convertendo para minúsculas para evitar problemas de case-sensitivity

        // URL de busca
        String endereco = "http://www.omdbapi.com/?apikey=1653b8ce&s=" + buscaFilme;

        // Criando cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Enviando requisição e recebendo resposta
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        // Obtenha o corpo da resposta
        String json = response.body();
        System.out.println(json); // Exibe o JSON para depuração (pode comentar depois)

        // Usando o Gson para deserializar a resposta JSON para o objeto correto
        Gson gson = new Gson();

        // Aqui, a resposta é um objeto que contém o campo "Search" que é uma lista de filmes
        com.google.gson.JsonObject jsonObject = gson.fromJson(json, com.google.gson.JsonObject.class);

        // Verifique se a chave "Search" existe
        if (jsonObject.has("Search")) {
            // Extrai a lista de filmes
            com.google.gson.JsonArray filmesArray = jsonObject.getAsJsonArray("Search");

            boolean filmeEncontrado = false;

            // Para cada filme na lista, convertemos para o objeto Titulo
            for (int i = 0; i < filmesArray.size(); i++) {
                Titulo t = gson.fromJson(filmesArray.get(i), Titulo.class);

                // Filtra para mostrar somente filmes com o nome exato (ignorando maiúsculas/minúsculas)
                if (t.getNome().toLowerCase().equals(buscaFilme)) {
                    System.out.println(t);
                    filmeEncontrado = true;
                    break; // Para assim que encontrar o filme exato
                }
            }

            if (!filmeEncontrado) {
                System.out.println("Nenhum filme exato encontrado.");
            }
        } else {
            System.out.println("Nenhum filme encontrado.");
        }
    }
}
