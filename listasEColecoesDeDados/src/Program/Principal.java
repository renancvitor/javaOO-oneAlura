package Program;

import calculos.Calculadora;
import calculos.FiltroRecomendacao;
import modelos.Episodio;
import modelos.Filme;
import modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoMinutos(180);

        meuFilme.exibeFechaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.printf("Média avaliações: " + "%.2f%n", meuFilme.mediaAvaliacoes());

        System.out.println(meuFilme.toString());

        Serie peakyBlinders = new Serie();
        peakyBlinders.setNome("Peaky Blinders");
        peakyBlinders.setAnoLancamento(2020);
        peakyBlinders.exibeFechaTecnica();
        peakyBlinders.setTemporadas(6);
        peakyBlinders.setEpisodiosPorTemporada(10);
        peakyBlinders.setMinutosPorEpisodio(60);
        System.out.println("Duração da temporada: " + peakyBlinders.getDuracaoMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Outro Filme");
        outroFilme.setAnoLancamento(2025);
        outroFilme.setDuracaoMinutos(200);
        outroFilme.avalia(8);

        Calculadora calc = new Calculadora();
        calc.incluir(meuFilme);
        calc.incluir(outroFilme);
        calc.incluir(peakyBlinders);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie(peakyBlinders);
        ep.setTotalVisualizacoes(500);
        filtro.filtra(ep);

        Filme filmeRenan = new Filme();
        filmeRenan.setDuracaoMinutos(200);
        filmeRenan.setNome("Todo mundo em Pânico 1");
        filmeRenan.setAnoLancamento(2003);
        filmeRenan.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeRenan);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);
    }
}
