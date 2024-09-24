import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que forneça um número
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        // Exibe a tabuada do número fornecido
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}
