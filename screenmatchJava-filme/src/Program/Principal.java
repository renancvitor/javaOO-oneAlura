package Program;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoMinutos = 180;

        meuFilme.exibeFechaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        System.out.println(meuFilme.somaAvaliacao);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.printf("%.2f%n", meuFilme.mediaAvaliacoes());
    }
}
