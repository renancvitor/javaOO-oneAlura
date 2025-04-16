package utilsDesafio;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonWriter {
    public static <T> void salvarComoJson(List<T> lista, String nomeArquivo, Gson gson) throws IOException {
        try (FileWriter fileWriter = new FileWriter(nomeArquivo)) {
            fileWriter.write(gson.toJson(lista));
        }
    }
}
