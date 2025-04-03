import java.util.Scanner;

public class Leitura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String filme = scanner.nextLine();
        System.out.println(filme);

        System.out.println("Qual o ano de lançamento:");
        int anoLancamento = scanner.nextInt();
        System.out.println(anoLancamento);

        System.out.println("Digite a sua avaliação do filme:");
        double nota = scanner.nextDouble();
        System.out.println(nota);

        scanner.close();
    }
}
