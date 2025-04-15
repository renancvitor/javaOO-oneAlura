package ProgramDesafio;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entiteDesafio.EnderecoViaCep;
import exceptionsDesafio.ErroDeConversaoDeCepException;
import serviceDesafio.ViaCepService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        ViaCepService viaCepService = new ViaCepService();

        System.out.println("Digite o CEP que deseja buscar(somente números): ");
        String cep = sc.nextLine();

        try {
            String json = viaCepService.buscarEndereco(cep);
            System.out.println("Resposta da API: " + json);

            EnderecoViaCep enderecoViaCep = gson.fromJson(json, EnderecoViaCep.class);

            System.out.println("Endereço Encontrado: " + enderecoViaCep);
        } catch (ErroDeConversaoDeCepException e) {
            System.out.println("Erro de conversão do CEP: " + e.getMensagem());
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro ao buscar o endereço: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }

        sc.close();
    }
}
