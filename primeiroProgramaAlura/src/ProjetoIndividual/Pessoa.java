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

    public void exibirDadosCliente() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-15s %s\n", "Nome:", getNome()));
        sb.append(String.format("%-15s %s\n", "Tipo de Conta:", getTipoConta()));
        sb.append(String.format("%-15s R$ %,.2f\n", "Saldo inicial:", getSaldo()));

        System.out.println(sb.toString());
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
    }

    public void receberValor(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Valor recebido com sucesso! Saldo atual: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void transferirValor(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Transferência realizada! Saldo atual: R$ " + String.format("%.2f", saldo));
        } else {
            System.out.println("Saldo insuficiente ou valor inválido. Favor verificar.");
        }
    }
}
