package ProgramDesafio;

public class FiltroRecomendacaoAudio {
    public void filtro(Reproducoes reproducoes) {
        if (reproducoes.getReproducoes() > 20000000) {
            System.out.println("Altamente recomendável!!\n");
        } else if (reproducoes.getReproducoes() < 20000000) {
            System.out.println("Recomendada pela maioria das pessoas.");
        } else {
            System.out.println("Experimente escutar!");
        }
    }
}
