import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int limite = 3;

        System.out.println("Digite " + limite + " nota(s) para o filme:" );
        for (int i = 0; i < limite; i++) {
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliações: " + String.format("%.2f", mediaAvaliacao / 3));

        scanner.close();
    }
}
