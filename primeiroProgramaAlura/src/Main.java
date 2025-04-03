public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.8) / 3;
        System.out.println(String.format("%.2f", media));

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);

    }
}
