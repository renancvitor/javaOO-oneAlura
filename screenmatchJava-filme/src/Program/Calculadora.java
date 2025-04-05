package Program;

public class Calculadora {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluir(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo;
        this.tempoTotal += titulo.getDuracaoMinutos();
    }
}
