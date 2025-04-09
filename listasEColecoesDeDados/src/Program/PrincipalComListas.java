package Program;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(9);
        Serie peakyBlinders = new Serie("Peaky Blinders", 2020);
        peakyBlinders.avalia(10);
        Filme outroFilme = new Filme("Outro Filme", 2025);
        outroFilme.avalia(6);
        Filme filmeRenan = new Filme("Todo mundo em Pânico 1", 2003);
        filmeRenan.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeRenan);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(peakyBlinders);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
