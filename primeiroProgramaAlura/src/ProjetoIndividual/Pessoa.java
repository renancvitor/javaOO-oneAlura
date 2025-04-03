package ProjetoIndividual;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String tipoConta;
    private double saldo;

    public Pessoa(String nome, String sobrenome, String tipoConta, double saldo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibitDadosCliente() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %s\n", "Nome:", getNome()));
        sb.append(String.format("%-15s %s\n", "Tipo de Conta:", getTipoConta()));
        sb.append(String.format("%-15s R$ %,.2f\n", "Saldo inicial:", getSaldo()));

        System.out.println(sb.toString());
    }
}
