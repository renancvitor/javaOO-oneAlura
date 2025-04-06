package ProgramDesafio;

public class Podcast extends Audio implements Reproducoes {
    private String locutor;
    private String convidado;

    public String getLocutor() {
        return locutor;
    }

    public void setLocutor(String locutor) {
        this.locutor = locutor;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    @Override
    public int getReproducoes() {
        int reproducoes = 200000;
        return reproducoes * 200000;
    }
}
