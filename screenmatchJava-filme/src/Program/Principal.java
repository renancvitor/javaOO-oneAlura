package Program;

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
    }
}
