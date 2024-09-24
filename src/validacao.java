import java.util.Scanner;

public class validacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 0;

        do {
            System.out.print("Por favor, digite sua idade (maior que 0): ");
            idade = scanner.nextInt();

            if (idade <= 0) {
                System.out.println("Idade inválida! A idade deve ser maior que 0.");
            }
        } while (idade <= 0);

        System.out.println("Sua idade é: " + idade);
        scanner.close();
    }
}
