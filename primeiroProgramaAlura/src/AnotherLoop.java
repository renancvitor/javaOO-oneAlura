import java.util.Scanner;

public class AnotherLoop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        System.out.println("Diga sua avaliação para o filme ou -1 para encerrar:");
        while (nota != -1) {
            nota = scanner.nextDouble();

            if (nota != 1) {
                mediaAvaliacao += nota;
                totalNotas++;
            }
        }

        System.out.println("Media de avaliações: " + String.format("%.2f", mediaAvaliacao / totalNotas));

        scanner.close();
    }
}
