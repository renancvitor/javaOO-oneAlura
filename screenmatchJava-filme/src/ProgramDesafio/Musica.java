package ProgramDesafio;

public class Musica extends Audio implements Reproducoes {
    private String cantor;
    private String genero;
    private String album;

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public int getReproducoes() {
        int reproducoes = 2000000;
        return reproducoes * 200000;
    }
}
