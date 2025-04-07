package ProgramDesafio;

public class Audio {
    private String nome;
    private String formato;
    private int duracao;
    private int anoLancamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void exibeFichaTecnica() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %s\n", "Nome:", getNome()));
        sb.append(String.format("%-15s %s\n", "Formato:", getFormato()));
        sb.append(String.format("%-15s %s\n", "Duração:", getDuracao()));
        sb.append(String.format("%-15s %s\n", "Ano lançamento:", getAnoLancamento()));

        System.out.printf(sb.toString());
    }
}
