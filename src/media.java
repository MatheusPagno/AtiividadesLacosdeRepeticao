import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números (n): ");
        int n = scanner.nextInt();

        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }

        double media = soma / n;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
