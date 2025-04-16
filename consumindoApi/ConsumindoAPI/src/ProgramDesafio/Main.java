package ProgramDesafio;

import com.google.gson.Gson;
import controllerDesafio.EnderecoController;
import modelsDesafio.Endereco;
import utilsDesafio.GsonConfig;
import serviceDesafio.ViaCepService;
import utilsDesafio.JsonWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cep = "";

        Gson gson = GsonConfig.criarGson();
        EnderecoController controller = new EnderecoController(new ViaCepService(), gson);
        List<Endereco> enderecos = new ArrayList<>();

        while (!cep.equalsIgnoreCase("sair")) {
            System.out.print("\nDigite o CEP que deseja buscar(somente números):  ");
            cep = sc.nextLine();

            if (cep.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Endereco endereco = controller.buscarEnderecoPorCep(cep);
                System.out.println("Endereço Encontrado: " + endereco);
                enderecos.add(endereco);
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        try {
            JsonWriter.salvarComoJson(enderecos, "enderecos.json", gson);
            System.out.println("\nArquivo 'enderecos.json' salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }

        System.out.println("\nO programa finalizou corretamente!");
        sc.close();
    }
}
