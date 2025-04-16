package utilsDesafio;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonConfig {
    public static Gson criarGson() {
        return new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setFieldNamingStrategy(FieldNamingPolicy.IDENTITY)
                .setPrettyPrinting()
                .create();
    }
}
