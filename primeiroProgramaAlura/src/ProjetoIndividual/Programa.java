package ProjetoIndividual;

public class Programa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Renan", "C. Vitor", "Corrente", 2500);

        System.out.println("*******************************************");
        System.out.println("Dados inicias do cliente:");
        System.out.println();

        pessoa.exibitDadosCliente();
        System.out.println("*******************************************");

        System.out.println("\nOperações:\n");

        System.out.println("1. Consultar saldo");
        System.out.println("2. Receber valor");
        System.out.println("3. Transferir valor");
        System.out.println("4. Sair");

        switch (operacao){

        }
    }
}
