package ProgramDesafio;

public class Main {
    public static void main(String[] args) {
        Musica attack = new Musica();
        attack.setFormato("Música");
        attack.setGenero("Rock");
        attack.setNome("Attack");
        attack.setCantor("System of a Down");
        attack.setAlbum("Aerials");
        attack.setAnoLancamento(2017);
        attack.setDuracao(3);

        attack.exibeFichaTecnica();
        System.out.println("Reproduções: " + attack.getReproducoes() + "\n");

        Podcast podpah = new Podcast();
        podpah.setFormato("Podcast");
        podpah.setNome("Podpah");
        podpah.setLocutor("Igão");
        podpah.setConvidado("Neymar Jr.");
        podpah.setAnoLancamento(2025);
        podpah.setDuracao(60);

        podpah.exibeFichaTecnica();
        System.out.println("Reproduções: " + podpah.getReproducoes());

    }
}
