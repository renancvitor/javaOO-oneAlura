package ProgramDesafio;

import com.google.gson.Gson;
import entiteDesafio.Endereco;
import utilsDesafio.GsonConfig;
import entiteDesafio.EnderecoViaCep;
import exceptionsDesafio.ErroDeConversaoDeCepException;
import serviceDesafio.ViaCepService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cep = "";
        Gson gson = GsonConfig.criarGson();

        ViaCepService viaCepService = new ViaCepService();

        List<Endereco> enderecos = new ArrayList<>();

        while (!cep.equalsIgnoreCase("sair")) {
            System.out.print("\nDigite o CEP que deseja buscar(somente números):  ");
            cep = sc.nextLine();

            if (cep.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                String json = viaCepService.buscarEndereco(cep);
//            System.out.println("Resposta da API: " + json);

                EnderecoViaCep enderecoViaCep = gson.fromJson(json, EnderecoViaCep.class);

                Endereco endereco = new Endereco(enderecoViaCep);

                System.out.println("Endereço Encontrado: " + endereco);

                enderecos.add(endereco);

            } catch (ErroDeConversaoDeCepException e) {
                System.out.println("Erro de conversão do CEP: " + e.getMensagem());
            } catch (IOException | InterruptedException e) {
                System.out.println("Erro ao buscar o endereço: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        System.out.println(enderecos);

        sc.close();
    }
}
