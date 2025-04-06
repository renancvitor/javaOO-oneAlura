package ProgramDesafio;

public class Main {
    public static void main(String[] args) {
        Musica attack = new Musica();
        attack.setFormato("Música");
        attack.setNome("Attack");
        attack.setCantor("System of a Down");
        attack.setAlbum("Aerials");
        attack.setAnoLancamento(2017);
        attack.setDuracao(3);

        attack.exibeFichaTecnica();
    }
}
