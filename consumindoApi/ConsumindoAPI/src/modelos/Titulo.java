package modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacao;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

//    public Titulo(TituloOmdb meuTituloOmdb) {
//        this.nome = meuTituloOmdb.title();
//        this.anoLancamento = meuTituloOmdb.year();
//    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public void exibeFechaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Duração do filme: " + duracaoMinutos);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacoes++;
    }

    public double mediaAvaliacoes() {
        return somaAvaliacao / totalAvaliacoes;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", anoLancamento=" + anoLancamento;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
