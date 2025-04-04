package Program;

public class Filme {

    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaAvaliacao;
    int totalAvaliacoes;
    int duracaoMinutos;

    void exibeFechaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Duração do filme: " + duracaoMinutos);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return somaAvaliacao / totalAvaliacoes;
    }
}
