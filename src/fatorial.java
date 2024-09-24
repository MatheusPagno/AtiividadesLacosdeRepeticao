import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();


        long fatorial = 1;


        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            int i = 1;

            do {
                fatorial *= i; //
                i++; //
            } while (i <= numero);


            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}
