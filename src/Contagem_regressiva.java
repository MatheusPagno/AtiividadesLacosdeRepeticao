import java.util.Scanner;

public class Contagem_regressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inicial para a contagem regressiva: ");
        int numero = scanner.nextInt();


        if (numero < 0) {
            System.out.println("Por favor, digite um número não negativo.");
        } else {

            System.out.println("Contagem Regressiva:");
            while (numero >= 0) {
                System.out.println(numero);
                numero--; // Decrementa o número
            }
        }

        scanner.close();
    }
}
